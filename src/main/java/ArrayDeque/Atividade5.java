package ArrayDeque;

import java.util.ArrayDeque;

public class Atividade5 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma fila com três nomes
        e use contains para responder duas perguntas:
        se "Bia" está na fila e se "Zoe" está.*/

        // 1. Criando a fila e adicionando três nomes (incluindo "Bia")
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Vitória");
        fila.add("Bia");
        fila.add("Carlos");

        // 2. Usando .contains() para verificar se "Bia" e "Zoe" estão na fila
        System.out.println("Bia está na fila? " + fila.contains("Bia"));
        System.out.println("Zoe está na fila? " + fila.contains("Zoe"));
    }

    /*.contains("Bia"): Percorre a fila verificando se
    existe algum elemento idêntico a "Bia". Como ela foi
    adicionada, o metodo devolve true.
    .contains("Zoe"): Como "Zoe" não foi inserida na fila,
    o metodo devolve false (sem alterar a ordem nem remover ninguém da fila).*/
}
