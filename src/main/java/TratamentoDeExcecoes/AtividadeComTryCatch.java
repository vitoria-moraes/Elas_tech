package TratamentoDeExcecoes;

import java.util.Scanner;

public class AtividadeComTryCatch {
    public static void main(String[] args) {

/*6 — Crie um array com 3 nomes. Mostre o
nome da posição 5 de propósito e trate a
ArrayIndexOutOfBoundsException com a mensagem
"Essa posição não existe." Depois do try/catch,
imprima "O programa continua funcionando."*/

        // Criando um array com 3 nomes (posições 0, 1 e 2)
        String[] nomes = {"Ana", "Carlos", "Beatriz"};

        try {
            // Tentando acessar a posição 5 de propósito (o array só vai até o índice 2)
            System.out.println(nomes[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Bloco executado quando tentamos acessar um índice inválido
            System.out.println("Essa posição não existe.");
        }

        // Esta linha fica fora do bloco try/catch e é executada normalmente após o tratamento do erro
        System.out.println("O programa continua funcionando.");
    }
}
