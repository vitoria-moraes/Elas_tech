package Strings;

import java.util.Scanner;

public class ExemploEqualsIgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String primeiroNome = sc.nextLine();

        System.out.print("Digite de novo: ");
        String segundoNome = sc.nextLine();

        //equalsIgnoreCase compara os textos ignorando maiúsculas e minúsculas
        boolean saoIguais = primeiroNome.equalsIgnoreCase(segundoNome);

        System.out.println("Os nomes são iguais? " + saoIguais);

        sc.close();
    }
}
