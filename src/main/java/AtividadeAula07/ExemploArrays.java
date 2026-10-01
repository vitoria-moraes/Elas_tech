package AtividadeAula07;

import java.util.Scanner;

public class ExemploArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ATIVIDADE 1: Array de notas e exibição formatada
        System.out.println("--- Atividade: Exibir Notas ---");
        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println(); // Linha em branco para separar


        // ATIVIDADE 2: Soma e média das notas
        System.out.println("--- Atividade: Soma e Média ---");
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = (double) soma / notas.length;

        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + media);
        System.out.println();

        // ATIVIDADE 3: Nomes de pessoas (Posições específicas)
        System.out.println("--- Atividade: Pessoas em Posições Específicas ---");
        String[] nomesPessoas = {"Samira", "Vitória", "Flora", "Maria", "Dolores"};
        System.out.println(nomesPessoas[0]);
        System.out.println(nomesPessoas[2]);
        System.out.println(nomesPessoas[4]);
        System.out.println();

        // ATIVIDADE 4: Leitura de 5 números e inversão
        System.out.println("--- Atividade: Leitura e Inversão de 5 Números ---");
        int[] novasNotas = new int[5];

        // Laço para preencher o array
        for (int i = 0; i < novasNotas.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            novasNotas[i] = sc.nextInt();
        }

        System.out.println("\n--- Números de trás para frente ---");

        // Laço separado para mostrar de trás pra frente
        for (int i = novasNotas.length - 1; i >= 0; i--) {
            System.out.println(novasNotas[i]);
        }

        // Fechamos o Scanner no final de tudo
        sc.close();
    }
}