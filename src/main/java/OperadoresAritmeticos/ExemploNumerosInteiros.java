package OperadoresAritmeticos;

public class ExemploNumerosInteiros {
    public static void main(String[] args) {
        System.out.println("1) Neste primeiro exemplo não está somando, está apenas concatenado os números como se fosse '22' o resultado.");
        System.out.println("2 + 2 = " + 2 + 2);

        System.out.println("2) Neste segundo exemplo está somando o que está dentro dos parênteses.");
        System.out.println("2 + 2 = " + (2 + 2));

        int a = 10;
        int b = 3;
        int resultado = a + b;

        System.out.println(resultado);

        int c = 10;
        int d = 3;
        int resultado2 = c - d;

        System.out.println(resultado2);

        int e = 10;
        int f = 3;
        int resultado3 = e * f;

        System.out.println(resultado3);

        int g = 10;
        int h = 3;
        int resultado4 = g / h;

        System.out.println(resultado4);

        int i = 10;
        int j = 3;
        int resultado5 = i % j;

        System.out.println(resultado5);
    }
}
