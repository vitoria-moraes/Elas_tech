package TratamentoDeExcecoes;

import java.util.Scanner;

public class AtividadeArray {
    public static void main(String[] args) {
       /* 2 — Crie um array com 5 notas. Peça uma posição para a
        pessoa e mostre a nota daquela posição. Se a posição não
        existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.*/

        double[] notas = {8.5, 7.0, 9.2, 6.0, 10.0};
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite a posicao que deseja consultar: ");
            int posicao = input.nextInt();

            // Tentativa de acessar a posição informada no array
            System.out.println("Nota na posição " + posicao + ": " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {

            // Bloco executado se o usuário digitar uma posição inválida (ex: 5, 10, -1)
            System.out.println("Erro: Posição inválida! O array só possui posições de 0 a 4.");
        }
    }
}
