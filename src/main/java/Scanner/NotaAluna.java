package Scanner;

import java.util.Scanner;

public class NotaAluna {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota: ");

        double nota = sc.nextDouble();
        if (nota>=7) {
            System.out.println("Aprovada!");
        } else  {
            System.out.println("Reprovada!");
        }


    }
}
