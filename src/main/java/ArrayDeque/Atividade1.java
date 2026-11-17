package ArrayDeque;

import java.util.ArrayDeque;

public class Atividade1 {
    public static void main(String[] args) {
     /*Enunciado: Crie uma fila e coloque
     três pessoas nela com add. Imprima a
     fila e quantas pessoas tem.*/

        // 2. Criando uma fila de Strings
        ArrayDeque<String> fila = new ArrayDeque<>();

        // 3. Adicionando três pessoas no final da fila com .add()
        fila.add("Vitória");
        fila.add("Carlos");
        fila.add("Beatriz");

        // 4. Imprimindo a fila completa e a quantidade de pessoas
        System.out.println("Fila atual: " + fila);
        System.out.println("Quantidade de pessoas na fila: " + fila.size());

    }

    /*Conceito de Fila (FIFO - First-In, First-Out): O ArrayDeque
    funcionando como fila segue a ordem de chegada:
    o primeiro que entra é o primeiro a ser atendido.
    .add(...): Insere cada nova pessoa no final da fila
    ("Vitória" é a primeira, "Carlos" o segundo e "Beatriz" a terceira).
    .size(): Retorna o total de pessoas aguardando na fila (3).*/
}
