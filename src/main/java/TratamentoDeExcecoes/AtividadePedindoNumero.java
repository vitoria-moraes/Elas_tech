package TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadePedindoNumero {
    public static void main(String[] args) {
        /*3 — Peça a idade da pessoa com scanner.nextInt().
Se ela digitar um texto em vez de um número, trate a
InputMismatchException e mostre uma mensagem pedindo um número.*/

                Scanner scanner = new Scanner(System.in);

                try {
                    System.out.print("Digite a sua idade: ");
                    // Tentativa de ler um número inteiro
                    int idade = scanner.nextInt();

                    System.out.println("Sua idade é: " + idade + " anos.");

                } catch (InputMismatchException e) {
                    // Bloco executado caso o usuário digite texto (ex: "vinte" em vez de 20)
                    System.out.println("Erro: Entrada inválida! Por favor, digite um número inteiro.");
                }

                scanner.close();
            }
        }