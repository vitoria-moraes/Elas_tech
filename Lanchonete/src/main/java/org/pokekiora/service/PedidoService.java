package org.pokekiora.service;

import org.pokekiora.model.Pedido;
import org.pokekiora.model.StatusPedido;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class PedidoService {

    private final Map<Integer, Pedido> pedidos;

    public PedidoService() {
        pedidos = new LinkedHashMap<>();
    }

    public void registrarPedido(Pedido pedido) {

        if (pedidos.containsKey(pedido.getNumero())) {
            throw new IllegalArgumentException(
                    "Já existe um pedido com essa comanda."
            );
        }

        pedidos.put(pedido.getNumero(), pedido);
    }

    public Pedido buscarPedido(int numero) {
        return pedidos.get(numero);
    }

    public boolean concluirPedido(int numero) {

        Pedido pedido = buscarPedido(numero);

        if (pedido == null ||
                pedido.getStatus() != StatusPedido.ABERTO) {
            return false;
        }

        pedido.setStatus(StatusPedido.CONCLUIDO);
        return true;
    }

    public boolean cancelarPedido(int numero) {

        Pedido pedido = buscarPedido(numero);

        if (pedido == null ||
                pedido.getStatus() != StatusPedido.ABERTO) {
            return false;
        }

        pedido.setStatus(StatusPedido.CANCELADO);
        return true;
    }

    public Collection<Pedido> listarPedidos() {
        return pedidos.values();
    }
}