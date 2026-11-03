package org.pokekiora.decorator;

import org.pokekiora.model.Poke;

import java.math.BigDecimal;
import java.util.List;

public class CreamCheese extends AdicionalDecorator {

    public CreamCheese(Poke poke) {
        super(poke);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Cream Cheese";
    }

    @Override
    public BigDecimal getPreco() {
        return super.getPreco().add(new BigDecimal("3.00"));
    }

    @Override
    public List<String> getIngredientes() {
        List<String> ingredientes = super.getIngredientes();
        ingredientes.add("Cream Cheese");
        return ingredientes;
    }
}