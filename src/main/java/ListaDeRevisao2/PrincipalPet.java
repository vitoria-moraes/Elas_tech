package ListaDeRevisao2;

public class PrincipalPet {
    public static void main(String[] args) {

        Pet pet1 = new Pet();
        pet1.nome = "Yuki";
        pet1.raca = "Gato";
        pet1.peso = 4.8;

        Pet pet2 = new Pet();
        pet2.nome = "Tigrão";
        pet2.raca = "Gato";
        pet2.peso = 3.2;

        Pet pet3 = new Pet();
        pet3.nome = "Thor";
        pet3.raca = "Gato";
        pet3.peso = 3.5;

        // Imprimindo a ficha do primeiro pet
        System.out.println("--- Ficha do Pet 1 ---");
        System.out.println("Nome: " + pet1.nome);
        System.out.println("Raça: " + pet1.raca);
        System.out.println("Peso: " + pet1.peso + " kg");

        System.out.println();

        // Imprimindo a ficha do segundo pet
        System.out.println("--- Ficha do Pet 2 ---");
        System.out.println("Nome: " + pet2.nome);
        System.out.println("Raça: " + pet2.raca);
        System.out.println("Peso: " + pet2.peso + " kg");

        System.out.println();

        // Imprimindo a ficha do segundo pet
        System.out.println("--- Ficha do Pet 3 ---");
        System.out.println("Nome: " + pet3.nome);
        System.out.println("Raça: " + pet3.raca);
        System.out.println("Peso: " + pet3.peso + " kg");

        /*Classe Molde (Pet): Funciona como uma "planta baixa" ou molde.
        Ela define quais características (nome, raca, peso)
        cada objeto do tipo Pet vai possuir.
        Instanciação (new Pet()): Usamos a palavra reservada new
        para criar instâncias reais (objetos físicos na memória)
        a partir do nosso molde. Cada objeto (pet1 e pet2)
        tem seus próprios valores independentes.
        Atribuição e Acesso (pet1.nome): Usamos o ponto (.)
        para acessar e modificar os atributos
        específicos de cada objeto separadamente.*/

    }
}
