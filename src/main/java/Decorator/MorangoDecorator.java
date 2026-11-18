package Decorator;

/*
Questão 3 (prática).
Adicional de morango (embrulhando um Acai e somando descrição e preço).
*/

public class MorangoDecorator extends AcaiDecorator {
    public MorangoDecorator(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 4.00;
    }
}

/*
PASSO A PASSO:
1. Herda de AcaiDecorator e delega a base para super(acai).
2. Soma "+ Morango" e R$ 4,00 ao resultado acumulado do açaí embrulhado.
*/