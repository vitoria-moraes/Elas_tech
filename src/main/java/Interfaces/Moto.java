package Interfaces;

public class Moto implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto ligada na partida elétrica.");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando no corredor!");
    }
}