package Interfaces;

/*
Exercício 3:
Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
e percorra com for-each chamando emitirSom(). Repare que não
tem nenhum if. Dica: animais.add(new Cachorro());
*/

import java.util.ArrayList;

public class Atividade3 {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

/*
Explicação Passo a Passo:
1. ArrayList<Animal>: Uma única lista tipada com a interface Animal consegue
   armazenar objetos de qualquer classe que assine esse contrato (Cachorro, Gato, etc.).
2. Sem necessidade de 'if': Ao percorrer a lista com for-each, apenas chamamos
   animal.emitirSom(). O polimorfismo se encarrega de executar o som específico
   de cada animal ("Au au!" e depois "Miau!"), sem precisarmos testar qual é
   o tipo do bicho com if/else.
*/