package Strings;

import java.util.Scanner;

public class ExemploChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        char primeiraLetra = nome.charAt(0);

        System.out.println("A primeira letra do seu nome é: " + primeiraLetra);

        sc.close();
    }
}
