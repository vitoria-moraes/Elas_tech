package ListadeRevisao4;

/*
QUESTÃO 3: GETTERS E SETTERS
Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).
Crie getters e setters para todos os atributos.
O setter de preco não deve aceitar valores menores ou iguais a zero.
O setter de quantidade não deve aceitar valores negativos.
No main, crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.
*/

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Erro: Preço deve ser maior que zero.");
            return;
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Erro: Quantidade não pode ser negativa.");
            return;
        }
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome("Teclado Mecânico");
        p.setPreco(250.0);
        p.setQuantidade(10);

        p.setPreco(-50.0);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço: R$ " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
    }
}

/*
PASSO A PASSO:
1. Atributos declarados como private para impedir alteração direta.
2. Validações adicionadas nos setters: bloqueiam preco <= 0 e quantidade < 0 usando return antecipado.
3. No main, o valor -50.0 é rejeitado pelo setter e o preço anterior (250.0) permanece intacto.
*/