package AtvidadesExtras;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Repete 3 vezes (para 3 produtos)
        for (int i = 0; i < 3; i++) {
            Produto novoProduto = new Produto();

            System.out.print("Insira o Nome do Produto: ");
            novoProduto.nome = sc.nextLine();

            System.out.print("Insira o Valor do produto: ");
            novoProduto.preco = sc.nextDouble();
            sc.nextLine(); // Limpa o "enter" que sobra do número

            // Verificação pedida no exercício
            if (novoProduto.preco > 100) {
                System.out.printf("Produto caro! Valor: R$ %.2f\n\n", novoProduto.preco);
            } else {
                System.out.printf("Produto com preço acessível! Valor: R$ %.2f\n\n", novoProduto.preco);
            }
        }

        sc.close();
    }
}