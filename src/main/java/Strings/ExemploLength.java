package Strings;

import java.util.Scanner;

public class ExemploLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        int quantidadeLetras = nomeCompleto.length();

        System.out.printf("O nome '%s' tem %d caracteres (contando os espaços).\n", nomeCompleto, quantidadeLetras);

        sc.close();
    }
}