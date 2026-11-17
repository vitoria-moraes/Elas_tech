package Polimorfismo;

public class Professora extends Pessoa {
    String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }

    // Sem @Override e com parâmetro a mais (virou sobrecarga, não sobrescrita!)
    void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }
}