package Spring.petshop.model;

/*
 * 3. Crie no pacote model a classe Pet, com os atributos nome (String), especie (String) e idade (int),
 * um construtor que recebe os três e os getters.
 */
public class Pet {

    private String nome;
    private String especie;
    private int idade;

    public Pet(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }
}

/*
 * Passo a passo:
 * Criada a classe Pet no pacote model com os atributos privados, construtor e getters.
 * Os getters são necessários para que o Spring consiga ler os atributos e transformar o objeto em JSON nas rotas.
 */