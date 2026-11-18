package Decorator;

/*
Questão 3 (prática).
Adicional de granola (embrulhando um Acai e somando descrição e preço).
*/

public class GranolaDecorator extends AcaiDecorator {
    public GranolaDecorator(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 2.50;
    }
}

/*
PASSO A PASSO:
1. Herda de AcaiDecorator e repassa o açaí recebido para super(acai).
2. Soma o texto "+ Granola" e o valor R$ 2,50 ao que já veio do objeto embrulhado.
*/