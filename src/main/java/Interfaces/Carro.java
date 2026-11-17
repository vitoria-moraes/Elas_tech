package Interfaces;

public class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Carro ligado na chave.");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando na pista!");
    }
}