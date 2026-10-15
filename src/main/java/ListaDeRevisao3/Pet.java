package ListaDeRevisao3;

public class Pet {
    private String nome;
    private String especie;
    private double peso;
    private String porte;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getPorte() { return porte; }
    public void setPorte(String porte) { this.porte = porte; }

    String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    void emitirSom() {
        System.out.println(nome + " faz algum som.");
    }
}