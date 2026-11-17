package Heranca;

public class Aluna extends Pessoa {
    String curso;

    public void estudar() {
        System.out.println(nome + " está estudando " + curso + ".");
    }
}