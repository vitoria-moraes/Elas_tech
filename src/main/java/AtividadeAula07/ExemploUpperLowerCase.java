package AtividadeAula07;

import java.util.Scanner;

public class ExemploUpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        //convertendo para maiúsculo e minúsculo
        String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();

        System.out.println("Em maiúsculo: " + nomeMaiusculo);
        System.out.println("Em minúsculo: " + nomeMinusculo);

        sc.close();
    }
}
