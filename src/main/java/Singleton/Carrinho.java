package Singleton;

public class Carrinho {
    // 1. Instância única privada e estática
    private static Carrinho instancia;

    // Atributo solicitado
    private int quantidadeItens = 0;

    // 2. Construtor privado
    private Carrinho() {}

    // 3. Método público estático para obter a instância
    public static Carrinho getInstancia() {
        if (instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }

    // Métodos solicitados
    public void adicionarItem() {
        this.quantidadeItens++;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

    // Método main para testar
    public static void main(String[] args) {
        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();   // Item 1
        telaPromocoes.adicionarItem();  // Item 2
        telaProdutos.adicionarItem();   // Item 3
        telaPromocoes.adicionarItem();  // Item 4

        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
    }
}