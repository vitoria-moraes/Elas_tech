
package org.pokekiora;

import org.pokekiora.decorator.CreamCheese;
import org.pokekiora.model.Pedido;
import org.pokekiora.model.Poke;
import org.pokekiora.model.PokeBase;
import org.pokekiora.model.StatusPedido;
import org.pokekiora.service.PedidoService;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PedidoServiceTest {

    @Test
    void deveRegistrarVariosPedidosSimultaneamente() {

        PedidoService service = new PedidoService();

        Poke poke1 = new PokeBase(
                "Kiôra Salmon",
                new BigDecimal("32.90"),
                List.of("Arroz japonês", "Salmão", "Manga")
        );

        Poke poke2 = new PokeBase(
                "Kiôra Tuna",
                new BigDecimal("36.90"),
                List.of("Arroz japonês", "Atum", "Avocado")
        );

        Pedido pedido1 = new Pedido(1, poke1);
        Pedido pedido2 = new Pedido(2, poke2);

        service.registrarPedido(pedido1);
        service.registrarPedido(pedido2);

        assertNotNull(service.buscarPedido(1));
        assertNotNull(service.buscarPedido(2));

        assertEquals(2, service.listarPedidos().size());
    }

    @Test
    void naoDeveRegistrarComandaDuplicada() {

        PedidoService service = new PedidoService();

        Poke poke = new PokeBase(
                "Kiôra Salmon",
                new BigDecimal("32.90"),
                List.of("Arroz japonês", "Salmão")
        );

        service.registrarPedido(new Pedido(10, poke));

        assertThrows(
                IllegalArgumentException.class,
                () -> service.registrarPedido(
                        new Pedido(10, poke)
                )
        );
    }

    @Test
    void deveCalcularPrecoComAdicional() {

        Poke poke = new PokeBase(
                "Kiôra Salmon",
                new BigDecimal("32.90"),
                List.of("Arroz japonês", "Salmão")
        );

        poke = new CreamCheese(poke);

        assertEquals(
                0,
                new BigDecimal("35.90").compareTo(
                        poke.getPreco()
                )
        );

        assertTrue(
                poke.getDescricao().contains("Cream Cheese")
        );
    }

    @Test
    void deveCancelarPedidoAberto() {

        PedidoService service = new PedidoService();

        Poke poke = new PokeBase(
                "Kiôra Salmon",
                new BigDecimal("32.90"),
                List.of("Arroz japonês", "Salmão")
        );

        Pedido pedido = new Pedido(20, poke);

        service.registrarPedido(pedido);

        assertTrue(service.cancelarPedido(20));

        assertEquals(
                StatusPedido.CANCELADO,
                pedido.getStatus()
        );

        assertFalse(service.cancelarPedido(20));
    }

    @Test
    void deveConcluirPedidoAberto() {

        PedidoService service = new PedidoService();

        Poke poke = new PokeBase(
                "Kiôra Tuna",
                new BigDecimal("36.90"),
                List.of("Arroz japonês", "Atum")
        );

        Pedido pedido = new Pedido(30, poke);

        service.registrarPedido(pedido);

        assertTrue(service.concluirPedido(30));

        assertEquals(
                StatusPedido.CONCLUIDO,
                pedido.getStatus()
        );

        assertFalse(service.concluirPedido(30));
    }

    @Test
    void deveRetornarIngredientesDoPoke() {

        Poke poke = new PokeBase(
                "Kiôra Veggie",
                new BigDecimal("27.90"),
                List.of("Arroz japonês", "Avocado", "Manga")
        );

        assertEquals(3, poke.getIngredientes().size());

        assertTrue(
                poke.getIngredientes().contains("Avocado")
        );

        assertFalse(
                poke.getIngredientes().contains("Cebolinha")
        );
    }
}
