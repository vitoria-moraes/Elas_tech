package Polimorfismo;

public class Boleto implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto gerado no valor de R$ %.2f (compensação em até 2 dias úteis).%n", valor);
    }
}