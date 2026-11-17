package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        System.out.println("Titular: " + c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());

        c.setTitular("");
        System.out.println("Titular: " + c.getTitular());

        c.setTitular("Ana");
        System.out.println("Titular: " + c.getTitular());

        c.depositar(500);
        System.out.println("Saldo: " + c.getSaldo());

        c.depositar(-100);
        c.sacar(2000);

        c.sacar(200);
        System.out.println("Saldo: " + c.getSaldo());

        Produto p = new Produto();
        System.out.println(p.nome);
        System.out.println(p.preco);

        System.out.println("Numero da conta: " + c.getNumeroConta());
    }
}