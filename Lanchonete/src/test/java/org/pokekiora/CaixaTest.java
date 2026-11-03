
package org.pokekiora;

import org.pokekiora.financeiro.Caixa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CaixaTest {

    private Caixa caixa;

    @BeforeEach
    void configurar() {
        caixa = Caixa.getInstancia();
        caixa.limparCaixa();
    }

    @Test
    void deveCalcularFechamentoCorretamente() {

        caixa.registrarTransacao(900001, new BigDecimal("32.90"));
        caixa.registrarTransacao(900002, new BigDecimal("36.90"));
        caixa.registrarGorjeta(new BigDecimal("5.00"));

        assertEquals(
                0,
                new BigDecimal("69.80").compareTo(
                        caixa.calcularTotalVendas()
                )
        );

        assertEquals(
                0,
                new BigDecimal("5.00").compareTo(
                        caixa.calcularTotalGorjetas()
                )
        );

        assertEquals(
                0,
                new BigDecimal("74.80").compareTo(
                        caixa.calcularFechamento()
                )
        );
    }

    @Test
    void naoDeveRegistrarTransacaoDuplicada() {

        int numero = 900003;

        assertTrue(
                caixa.registrarTransacao(
                        numero,
                        new BigDecimal("32.90")
                )
        );

        assertFalse(
                caixa.registrarTransacao(
                        numero,
                        new BigDecimal("32.90")
                )
        );
    }

    @Test
    void deveSomarGorjetasDeMesmoValor() {

        caixa.registrarGorjeta(new BigDecimal("5.00"));
        caixa.registrarGorjeta(new BigDecimal("5.00"));

        assertEquals(
                0,
                new BigDecimal("10.00").compareTo(
                        caixa.calcularTotalGorjetas()
                )
        );
    }

    @Test
    void naoDeveRegistrarValorInvalido() {

        assertFalse(
                caixa.registrarTransacao(
                        900004,
                        BigDecimal.ZERO
                )
        );

        assertFalse(
                caixa.registrarTransacao(
                        900005,
                        new BigDecimal("-10.00")
                )
        );

        assertEquals(
                0,
                BigDecimal.ZERO.compareTo(
                        caixa.calcularTotalVendas()
                )
        );
    }
}
