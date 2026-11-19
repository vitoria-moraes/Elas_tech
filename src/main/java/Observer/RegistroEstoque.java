package Observer;

/*
6 - b) Crie uma classe RegistroEstoque que implementa a interface e imprime "Nova quantidade: " + a quantidade.
*/

public class RegistroEstoque implements ObservadorEstoque {
    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade: " + quantidade);
    }
}

/*
PASSO A PASSO:
1. Implementa ObservadorEstoque e exibe no console toda nova atualização recebida.
*/