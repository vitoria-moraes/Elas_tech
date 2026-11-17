package FactoryAdpaterFacade;

/*
Questão 3 (prática).
No main, use a fábrica para criar um cachorro e um gato e chame emitirSom() nos dois.
O main não pode ter new Cachorro() nem new Gato().
*/

public class MainFactory {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal a1 = factory.getAnimal("cachorro");
        Animal a2 = factory.getAnimal("gato");

        a1.emitirSom();
        a2.emitirSom();
    }
}

/*
PASSO A PASSO:
1. O main conhece apenas AnimalFactory e a interface Animal, sem nenhum "new Cachorro()" ou "new Gato()".
*/