package Decorator;

/*
Questão 3 (prática).
public abstract class AcaiDecorator implements Acai {
    protected Acai acaiEmbrulhado;
    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }
}
*/

public abstract class AcaiDecorator implements Acai {
    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }
}

/*
PASSO A PASSO:
1. Implementa Acai para poder ser passado dentro de outros decorators e guarda o objeto anterior em acaiEmbrulhado.
*/