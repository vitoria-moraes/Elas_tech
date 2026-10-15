package ListaDeRevisao;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 3;

        do {
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Voce escolheu : Ver camisas");
                    break;
                case 2:
                    System.out.println("Voce escolheu : Ver calças");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 3);
        scanner.close();
    }
}
