package org.pokekiora.model;

import java.math.BigDecimal;

public class Pedido {

    private final int numero;
    private final Poke poke;
    private StatusPedido status;

    public Pedido(int numero, Poke poke) {
        this.numero = numero;
        this.poke = poke;
        this.status = StatusPedido.ABERTO;
    }

    public int getNumero() {
        return numero;
    }

    public Poke getPoke() {
        return poke;
    }

    public BigDecimal getValor() {
        return poke.getPreco();
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}