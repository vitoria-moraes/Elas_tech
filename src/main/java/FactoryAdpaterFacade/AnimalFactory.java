package FactoryAdpaterFacade;

/*
Questão 3 (prática).
Crie a classe AnimalFactory com um método getAnimal(String tipo):
• se o tipo for "cachorro", devolve um Cachorro;
• se o tipo for "gato", devolve um Gato.
*/

public class AnimalFactory {
    public Animal getAnimal(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("cachorro")) {
            return new Cachorro();
        }
        if (tipo.equalsIgnoreCase("gato")) {
            return new Gato();
        }
        return null;
    }
}

/*
PASSO A PASSO:
1. O retorno do metodo é o tipo da interface (Animal), desacoplando quem chama da classe concreta.
2. Usa equalsIgnoreCase para evitar problemas caso passem "Cachorro" ou "cachorro".
*/