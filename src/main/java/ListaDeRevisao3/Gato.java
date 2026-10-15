package ListaDeRevisao3;

public class Gato extends Pet {
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Miau!");
    }
}