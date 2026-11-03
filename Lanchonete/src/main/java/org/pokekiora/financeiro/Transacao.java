package org.pokekiora.financeiro;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Transacao {

    private final int numeroPedido;
    private final BigDecimal valor;
    private final LocalDate data;

    public Transacao(int numeroPedido, BigDecimal valor) {
        this.numeroPedido = numeroPedido;
        this.valor = valor;
        this.data = LocalDate.now();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public boolean equals(Object objeto) {

        if (this == objeto) {
            return true;
        }

        if (!(objeto instanceof Transacao)) {
            return false;
        }

        Transacao outra = (Transacao) objeto;

        return numeroPedido == outra.numeroPedido
                && data.equals(outra.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPedido, data);
    }
}