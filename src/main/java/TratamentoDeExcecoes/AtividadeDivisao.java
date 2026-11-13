package TratamentoDeExcecoes;

import java.util.Scanner;

import static java.util.Scanner.*;

public class AtividadeDivisao {
    public static void main(String[] args) {
        /*1 — Faça um programa que peça dois números inteiros
        e mostre a divisão do primeiro pelo segundo.
        Se a pessoa digitar 0 no segundo, trate a ArithmeticException
        e mostre uma mensagem explicando que não
        dá pra dividir por zero.
        */

        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Digite uma nota: ");
            int nota = input.nextInt();

            System.out.print("Digite outra nota: ");
            int nota2 = input.nextInt();

            int divisao = nota / nota2;
            System.out.print("Resultado da divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro : Não é possível dividir por zero");
        }
    }
}
