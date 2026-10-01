package AtvidadesExtras;

import java.util.Scanner;

public class Atividade1 {
        public static void main(String[] args) {
                double valor;
                String nomeDoLanche;

                Scanner sc = new Scanner(System.in);

                System.out.print("Digite o valor do lanche: ");
                valor = sc.nextDouble();

                sc.nextLine(); // Limpa o buffer do teclado

                System.out.print("Digite o nome do lanche: ");
                nomeDoLanche = sc.nextLine();

                if (valor > 30) {
                        double valorComDesconto = valor - 5;
                        System.out.printf("O lanche %s com desconto custará R$ %.2f.\n", nomeDoLanche, valorComDesconto);
                } else {
                        System.out.printf("O lanche %s custará R$ %.2f (sem desconto).\n", nomeDoLanche, valor);
                }

                sc.close();
        }
}