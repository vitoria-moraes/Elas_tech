package ListaDeRevisao;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int ano = input.nextInt();

        // Limpa o buffer do teclado (consome o "Enter" que sobrou)
        input.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nome = input.nextLine();

        System.out.println("O usuário : " + nome + " nasceu em : " + ano + ".");

        input.close(); // Boa prática para fechar o Scanner
    }
}
