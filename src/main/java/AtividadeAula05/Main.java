package AtividadeAula05;

public class Main {
    public static void main(String[] args) {

        Animal gato = new Animal();
        gato.castrado = true;
        gato.idade = 2;

        System.out.println("Gato é castrado : " + gato.castrado);
        System.out.println("Gato tem : " + gato.idade + " anos");

    }
}
