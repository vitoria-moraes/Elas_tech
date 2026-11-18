package Decorator;

/*
Questão 3 (prática).
public class AcaiSimples implements Acai {
    public String getDescricao() {
        return "Açaí Simples";
    }
    public double getPreco() {
        return 12.00;
    }
}
*/

public class AcaiSimples implements Acai {
    @Override
    public String getDescricao() {
        return "Açaí Simples";
    }

    @Override
    public double getPreco() {
        return 12.00;
    }
}

/*
PASSO A PASSO:
1. Implementação base que será embrulhada pelos adicionais.
*/