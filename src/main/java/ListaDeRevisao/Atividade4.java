package ListaDeRevisao;

public class Atividade4 {
    public static void main(String[] args) {

        // Instanciando o segundo objeto (um gato)
        PetAtividade4 cachorro = new PetAtividade4();
        cachorro.nome = "Rafael";
        cachorro.raca = "Boder Collie";
        cachorro.peso = 15.0;

        // Instanciando o segundo objeto (um gato)
        PetAtividade4 gato = new PetAtividade4();
        gato.nome = "Minerva";
        gato.raca = "Gato";
        gato.peso = 4.5;

        // Exibindo os dados dos pets no console para testar
        System.out.println("--- Cachorro ---");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Peso: " + cachorro.peso + " kg\n");

        System.out.println("--- Gato ---");
        System.out.println("Nome: " + gato.nome);
        System.out.println("Raça: " + gato.raca);
        System.out.println("Peso: " + gato.peso + " kg");


    }
}
