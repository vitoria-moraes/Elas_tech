package org.pokekiora.decorator;

import org.pokekiora.model.Poke;

import java.math.BigDecimal;
import java.util.List;

public class Tare extends AdicionalDecorator {

    public Tare(Poke poke) {
        super(poke);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Molho Tarê";
    }

    @Override
    public BigDecimal getPreco() {
        return super.getPreco().add(new BigDecimal("2.00"));
    }

    @Override
    public List<String> getIngredientes() {
        List<String> ingredientes = super.getIngredientes();
        ingredientes.add("Molho Tarê");
        return ingredientes;
    }
}