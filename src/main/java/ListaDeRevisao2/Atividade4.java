package ListaDeRevisao2;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        /*Enunciado do Exercício: Peça a idade
        e diga se a pessoa é maior ou menor de idade.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade : ");
        int idade = input.nextInt();

        if (idade >= 18 ) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }
}
