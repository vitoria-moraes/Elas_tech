package Metodos;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // --- Exercício 1 ---
        System.out.println("Exercício 1");
        mostrarBoasVindas();
        System.out.println();

        // --- Exercício 2 ---
        System.out.println("Exercício 2");
        Utilidades.saudar("Ana");
        Utilidades.saudar("Carlos");
        Utilidades.saudar("Mariana");
        System.out.println();

        // --- Exercício 3 ---
        System.out.println("Exercício 3");
        int valorDobro = Utilidades.dobro(15);
        System.out.println("O dobro é: " + valorDobro);
        System.out.println();

        // --- Exercício 4 ---
        System.out.println("Exercício 4");
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = Utilidades.calcularMedia(nota1, nota2);
        // %.2f formata para mostrar exatamente 2 casas decimais
        System.out.printf("Média calculada: %.2f\n", media);
        System.out.println();

        // --- Exercício 5 ---
        System.out.println("Exercício 5");
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("Status: Maior de idade.");
        } else {
            System.out.println("Status: Menor de idade.");
        }
        System.out.println();

        // --- Exercício 6 ---
        System.out.println("Exercício 6");
        System.out.println("Soma de 2 inteiros (10 + 20): " + Utilidades.somar(10, 20));
        System.out.println("Soma de 3 inteiros (5 + 5 + 5): " + Utilidades.somar(5, 5, 5));
        System.out.println("Soma de 2 decimais (4.5 + 2.5): " + Utilidades.somar(4.5, 2.5));
        System.out.println();

        // --- Exercício 7 ---
        System.out.println("Exercício 7");
        Utilidades.saudacao();
        Utilidades.saudacao("Carol");
        System.out.println();

        scanner.close();
    }

    // Exercício 1: Metodo criado fora do main, mas dentro da classe
    public static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    }
}