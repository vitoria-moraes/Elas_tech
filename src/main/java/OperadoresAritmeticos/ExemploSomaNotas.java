package OperadoresAritmeticos;

public class ExemploSomaNotas {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;
        int soma = nota1 + nota2 + nota3;
        int media = soma / 3;

        System.out.println("Soma: " + soma + " | Média: " + media);

        int a = 3, b = 4, c = 5;
        int resultado = a + b * c;
        System.out.println("Resultado : " + resultado);

        int d = 3, e = 4, f = 5;
        int resultado2 = (d + e) * f;
        System.out.println("Resultado : " + resultado2);

    }
}
