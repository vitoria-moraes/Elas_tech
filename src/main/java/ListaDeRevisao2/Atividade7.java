package ListaDeRevisao2;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        /*Enunciado do Exercício: Pergunte o nome
        da pessoa e responda: "Olá, [nome]!"*/

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Olá, " + nome + "!");

    }
}
