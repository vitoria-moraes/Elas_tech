package Polimorfismo;

public class Painel {
    public void exibir(String texto) {
        System.out.println("Texto recebido (String): " + texto);
    }

    public void exibir(int numero) {
        System.out.println("Número inteiro recebido (int): " + numero);
    }

    public void exibir(boolean status) {
        System.out.println("Valor lógico recebido (boolean): " + status);
    }

    public void exibir(double decimal) {
        System.out.println("Número decimal recebido (double): " + decimal);
    }
}