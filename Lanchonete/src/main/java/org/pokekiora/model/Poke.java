package org.pokekiora.model;

import java.math.BigDecimal;
import java.util.List;

public interface Poke {

    String getDescricao();

    BigDecimal getPreco();

    List<String> getIngredientes();
}