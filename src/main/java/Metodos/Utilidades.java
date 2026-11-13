package Metodos;

public class Utilidades {
    public static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }
    public static int dobro(int numero) {
       return numero * 2;
    }
    public static double calcularMedia(double n1, double n2) {
       return  (n1 + n2) / 2.0;
    }
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
    public static double somar(double a, double b) {
        return a + b;
    }
    public static void saudacao() {
        System.out.println("Olá!");
    }
    public static void saudacao(String nome) {
        System.out.println("Olá : " + nome);
    }
}
