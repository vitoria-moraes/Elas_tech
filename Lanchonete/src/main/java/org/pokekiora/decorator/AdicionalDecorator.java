package org.pokekiora.decorator;

import org.pokekiora.model.Poke;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class AdicionalDecorator implements Poke {

    protected final Poke poke;

    public AdicionalDecorator(Poke poke) {
        this.poke = poke;
    }

    @Override
    public String getDescricao() {
        return poke.getDescricao();
    }

    @Override
    public BigDecimal getPreco() {
        return poke.getPreco();
    }

    @Override
    public List<String> getIngredientes() {
        return new ArrayList<>(poke.getIngredientes());
    }
}