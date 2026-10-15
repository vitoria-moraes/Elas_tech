package ListaDeRevisao3;

public class Cachorro extends Pet {
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Au au!");
    }
}