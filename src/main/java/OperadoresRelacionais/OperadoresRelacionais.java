package OperadoresRelacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 5;

        int a2 = 10;
        int b2 = 3;

        int a3 = 3;
        int b3 = 10;


        if (a1 == b1) {
            System.out.println("As notas são iguais");
        } else {
            System.out.println("As notas são diferentes");
        }

        if (a2 != b2) {
            System.out.println("As notas são diferentes");
        } else {
            System.out.println("As notas são iguais");
        }

        if (a2 <= b2) {
            System.out.println("A segunda é maior");
        } else {
            System.out.println("A primeira é maior");
        }

        if (a3 >= b3) {
            System.out.println("A segunda é menor");
        } else {
            System.out.println("A primeira é menor");
        }

        boolean estaChovendo = true;

        if (true) {
            System.out.println("Está chovendo");
        } else {
            System.out.println("Não está chovendo");
        }
    }
}
