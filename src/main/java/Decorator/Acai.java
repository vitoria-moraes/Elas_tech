package Decorator;

/*
Questão 3 (prática).
O seu sistema já tem esta interface e estas duas classes:
public interface Acai {
    String getDescricao();
    double getPreco();
}
*/

public interface Acai {
    String getDescricao();
    double getPreco();
}

/*
PASSO A PASSO:
1. Define o contrato base (Componente) que tanto o açaí simples quanto os adicionais (decorators) seguem.
*/