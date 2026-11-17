package Interfaces;

public class Atividade1 {
    public static void main(String[] args) {
        /*
        Crie uma interface Animal com o metodo emitirSom().
        Crie a classe Cachorro que implementa ela e imprime "Au au!".
        Na Main, crie um cachorro e chame o metodo. Não esqueça do @Override.
        */
                Cachorro cachorro = new Cachorro();
                cachorro.emitirSom();
            }
        }


        /*
        Explicação Passo a Passo:
        Arquivos separados: Como Animal.java, Cachorro.java e Atividade1.java estão
        no mesmo pacote, o Java reconhece todos automaticamente sem precisar de import.
        public: Quando cada interface ou classe tem seu próprio arquivo com o mesmo
        nome, todas devem ser declaradas como 'public'.
        */
