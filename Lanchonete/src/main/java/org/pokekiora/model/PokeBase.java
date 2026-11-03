package org.pokekiora.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PokeBase implements Poke {

    private final String nome;
    private final BigDecimal preco;
    private final List<String> ingredientes;

    public PokeBase(String nome, BigDecimal preco, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = new ArrayList<>(ingredientes);
    }

    @Override
    public String getDescricao() {
        return nome + " - " + String.join(", ", ingredientes);
    }

    @Override
    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public List<String> getIngredientes() {
        return new ArrayList<>(ingredientes);
    }
}