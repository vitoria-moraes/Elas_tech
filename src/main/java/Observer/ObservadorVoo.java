package Observer;

/*
4 - A interface já está pronta:
public interface ObservadorVoo {
    void atualizar(String status);
}
*/

public interface ObservadorVoo {
    void atualizar(String status);
}

/*
PASSO A PASSO:
1. Define o contrato que qualquer classe interessada nas mudanças de status do voo deve implementar.
*/