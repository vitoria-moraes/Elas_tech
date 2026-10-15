package Strings;

import java.util.Scanner;

public class ExemploContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean aparece = frase.contains(palavra);

        System.out.println("A palavra aparece na frase? " + aparece);

        sc.close();
    }
}
