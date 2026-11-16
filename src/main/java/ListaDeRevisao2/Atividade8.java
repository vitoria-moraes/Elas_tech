package ListaDeRevisao2;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        /*Enunciado do Exercício: Peça o nome
        completo e mostre quantas letras ele tem.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome completo : ");
        String nomeCompleto = input.nextLine();

        // O metodo length() conta todos os caracteres da String (incluindo os espaços)
        int quantidadeLetras = nomeCompleto.length();

        System.out.println("O seu nome tem " + quantidadeLetras + " letras (contando espaços.");

    }
}
