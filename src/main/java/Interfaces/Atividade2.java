package Interfaces;

    public class Atividade2 {
        /*
        Agora acrescente a classe Gato, que implementa a mesma interface e
        imprime "Miau!". Na main, declare as duas variáveis como Animal:
        Animal bidu = new Cachorro();
        Animal salem = new Gato();
        Chame emitirSom() nas duas.
        */

        public static void main(String[] args) {
            Animal bidu = new Cachorro();
            Animal salem = new Gato();

            bidu.emitirSom();
            salem.emitirSom();
        }
    }

/*
Explicação Passo a Passo:
1. Polimorfismo com Interface (Animal bidu = new Cachorro()): Como tanto
   Cachorro quanto Gato implementam a interface Animal, ambos "são um" Animal.
   Por isso podemos declarar o tipo da variável como Animal e instanciar a
   classe específica na direita.
2. Execução dinâmica: Mesmo ambas as variáveis sendo do tipo Animal, o Java
   sabe qual objeto real está dentro de cada uma na hora de rodar, chamando
   o emitirSom() do Cachorro ("Au au!") para bidu e do Gato ("Miau!") para salem.
*/
