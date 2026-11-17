package ArrayDeque;

import java.util.ArrayDeque;

public class Atividade6 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        se estiver vazia -> "Não tem ninguém na fila."
        se tiver gente -> "Próximo: [nome]
        Depois adicione uma pessoa e teste de novo.*/

        // 1. Criando uma fila vazia
        ArrayDeque<String> fila = new ArrayDeque<>();

        // 2. Primeiro teste (com a fila vazia)
        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

        // 3. Adicionando uma pessoa na fila
        fila.add("Vitória");

        // 4. Segundo teste (agora com gente na fila)
        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());


        }
    }
}
