package OperadoresAritmeticos;

public class Desafio {
    public static void main(String[] args) {
        int segundos = 3785;
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Desafio: " + segundos + " segundos equivalem a "
                + minutos + " minutos e " + segundosRestantes + " segundos.");
    }
}
