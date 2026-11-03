package org.pokekiora.decorator;

import org.pokekiora.model.Poke;

import java.math.BigDecimal;
import java.util.List;

public class SalmaoExtra extends AdicionalDecorator {

    public SalmaoExtra(Poke poke) {
        super(poke);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Salmão Extra";
    }

    @Override
    public BigDecimal getPreco() {
        return super.getPreco().add(new BigDecimal("8.00"));
    }

    @Override
    public List<String> getIngredientes() {
        List<String> ingredientes = super.getIngredientes();
        ingredientes.add("Salmão Extra");
        return ingredientes;
    }
}