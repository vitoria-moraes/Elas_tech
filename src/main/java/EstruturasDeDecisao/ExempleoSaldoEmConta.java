package EstruturasDeDecisao;

public class ExempleoSaldoEmConta {
    public static void main(String[] args) {
        //2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
        // Se o saldo for suficiente,
        // mostre "Compra aprovada!" e o saldo restante.
        // Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldoDaConta = 500;
        double valorDaCompra = 320;

        if(saldoDaConta >= 500){
            double saldoRestante = saldoDaConta - valorDaCompra;
            System.out.println("Compra aprovada!");
            System.out.printf("Saldo restante: R$%.2f\n", saldoRestante);;
        } else {
            double quantoFalta = valorDaCompra - saldoDaConta;
            System.out.println("Saldo insuficiente!");
            System.out.printf("Está faltando: R$%.2f\n", quantoFalta);
        }
    }
}
