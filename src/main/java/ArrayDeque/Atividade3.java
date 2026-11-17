package ArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade3 {
    public static void main(String[] args) {
        /*Enunciado: Mesma fila. Agora use poll
        para atender o primeiro e imprima a
        fila depois. Compare com o exercício 2.*/

        // 1. Criando a mesma fila do exercício anterior
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.addAll(List.of("Vitória", "Carlos", "Beatriz", "Daniel"));

        // 2. Usando .poll() para atender (remover) o primeiro da fila
        String atendido = fila.poll();
        System.out.println("Pessoa atendida (poll): " + atendido);

        // 3. Imprimindo a fila depois para comparar com o exercício 2
        System.out.println("Fila após o poll: " + fila);
    }

    /*.poll() vs .peek():No Exercício 2, o .peek()
    apenas olhou quem era o primeiro da fila
    ("Vitória"), mantendo ela lá dentro.
    Aqui no Exercício 3, o .poll() atende a pessoa:
    ele devolve o primeiro elemento ("Vitória") e o remove da fila.
    Fila Atualizada: Ao imprimir a fila depois do poll(),
    você verá que "Vitória" saiu e "Carlos" passou a ser
    o novo primeiro da fila ([Carlos, Beatriz, Daniel]).*/
}
