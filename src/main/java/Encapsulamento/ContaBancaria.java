package Encapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        this.saldo += valor;
        registrarLog("deposito de " + valor);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        if (!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        registrarLog("saque de " + valor);
    }

    private boolean temSaldo(double valor) {
        return this.saldo >= valor;
    }

    private void registrarLog(String acao) {
        System.out.println("[LOG] " + this.titular + ": " + acao);
    }
}