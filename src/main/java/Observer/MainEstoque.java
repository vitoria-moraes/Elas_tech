package Observer;

/*
6 - d) No main, adicione um RegistroEstoque e mude a quantidade duas vezes.
*/

public class MainEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(50);
        estoque.setQuantidade(35);
    }
}

/*
PASSO A PASSO:
1. Registra o RegistroEstoque no Estoque e altera a quantidade duas vezes, disparando duas notificações automáticas.
*/