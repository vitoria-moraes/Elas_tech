package org.pokekiora.decorator;

import org.pokekiora.model.Poke;

import java.math.BigDecimal;
import java.util.List;

public class Avocado extends AdicionalDecorator {

    public Avocado(Poke poke) {
        super(poke);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Avocado";
    }

    @Override
    public BigDecimal getPreco() {
        return super.getPreco().add(new BigDecimal("4.00"));
    }

    @Override
    public List<String> getIngredientes() {
        List<String> ingredientes = super.getIngredientes();
        ingredientes.add("Avocado");
        return ingredientes;
    }
}