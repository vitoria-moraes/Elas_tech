package Scanner;

import java.util.Scanner;

public class ExemploSoma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        int soma = num + num2;
        System.out.println("Soma: " + soma);

        int subtracao = num - num2;
        System.out.println("Subtracao: " + subtracao);

        int multiplicacao = num * num2;
        System.out.println("Multiplicacao: " + multiplicacao);

        double divisao = num / num2;
        System.out.println("Divisao: " + divisao);

        double resto = num % num2;
        System.out.println("Resto: " + resto);

        sc.close();
    }
}
