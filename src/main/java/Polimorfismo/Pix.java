package Polimorfismo;

public class Pix implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado instantaneamente via Pix.%n", valor);
    }
}