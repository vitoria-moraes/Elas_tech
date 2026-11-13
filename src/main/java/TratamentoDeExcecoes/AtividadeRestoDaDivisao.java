package TratamentoDeExcecoes;

import java.util.Scanner;

public class AtividadeRestoDaDivisao {
    public static void main(String[] args) {
        /*5 — Peça um número para a pessoa e mostre o
resto da divisão de 100 por esse número.
Trate a ArithmeticException para o caso de ela digitar 0.*/

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // Calculando o resto da divisão de 100 pelo número informado (usando o operador %)
            int resto = 100 % numero;
            System.out.println("O resto da divisão de 100 por " + numero + " é: " + resto);

        } catch (ArithmeticException e) {
            // Bloco executado caso o usuário digite 0 (não é possível dividir ou tirar resto por zero)
            System.out.println("Erro: Não é possível calcular o resto dividindo por zero.");
        }

        scanner.close();
    }
}
