package org.pokekiora.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConsole {

    private final Scanner sc = new Scanner(System.in);

    public int lerInteiro(String mensagem) {

        while (true) {

            System.out.print(mensagem);

            try {

                int valor = sc.nextInt();
                sc.nextLine();

                return valor;

            } catch (InputMismatchException e) {

                sc.nextLine();

                System.out.println(
                        "Entrada inválida! Digite um número inteiro."
                );
            }
        }
    }

    public double lerDecimal(String mensagem) {

        while (true) {

            System.out.print(mensagem);

            try {

                double valor = sc.nextDouble();
                sc.nextLine();

                if (valor < 0 || !Double.isFinite(valor)) {
                    System.out.println(
                            "Digite um valor válido e não negativo."
                    );
                    continue;
                }

                return valor;

            } catch (InputMismatchException e) {

                sc.nextLine();

                System.out.println(
                        "Entrada inválida! Digite um valor numérico."
                );
            }
        }
    }

    public String lerTexto(String mensagem) {

        System.out.print(mensagem);

        return sc.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void fechar() {
        sc.close();
    }
}