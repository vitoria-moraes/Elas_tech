package Scanner;

import java.util.Scanner;

public class ExemploNomeIdadeScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        int proximaIdade = idade + 1;

        System.out.println("Oi " + nome + ", você tem " + idade + " anos e vai fazer " + proximaIdade + " no próximo aniversário.");

        scanner.close();
    }
}
