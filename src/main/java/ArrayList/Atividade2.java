package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Atividade2 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma lista já preenchida com quatro frutas.
        Imprima a primeira, a última e quantas frutas tem.*/

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Morango");
        frutas.add("Uva");

        // Pegando a primeira fruta (índice 0)
        System.out.println("Primeira fruta: " + frutas.get(0));

        // Pegando a última fruta (índice: tamanho total - 1)
        System.out.println("Última fruta: " + frutas.get(frutas.size() - 1));

        // Mostrando a quantidade total de frutas na lista
        System.out.println("Quantidade de frutas: " + frutas.size());

    }
}
