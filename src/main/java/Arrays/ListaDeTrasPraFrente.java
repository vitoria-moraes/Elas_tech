package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTrasPraFrente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println(numeros[i]);
            }

            sc.close();
    }
}
