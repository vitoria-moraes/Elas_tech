package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Atividade3 {
    public static void main(String[] args) {
        /*Crie um ArrayList com nomes repetidos.
        Use new HashSet<>(lista) para
        tirar os repetidos. Imprima os dois e compare.*/

        // 1. Criando um ArrayList e adicionando nomes repetidos
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Vitória");
        lista.add("Ana");
        lista.add("Vitória");
        lista.add("Carlos");
        lista.add("Ana");

        // 2. Convertendo a lista para um HashSet (remove as duplicatas automaticamente)
        HashSet<String> conjuntoSemRepetidos = new HashSet<>(lista);

        // 3. Imprimindo os dois para comparar
        System.out.println("ArrayList original (" + lista.size() + " itens): " + lista);
        System.out.println("HashSet sem repetidos (" + conjuntoSemRepetidos.size() + " itens): " + conjuntoSemRepetidos);
    }
    /*Conversão Direta (new HashSet<>(lista)):
    O construtor do HashSet aceita qualquer outra coleção (como um ArrayList).
    Ao passar lista dentro dos parênteses, o Java copia todos os itens
    para dentro do conjunto, descartando automaticamente qualquer valor duplicado.
    Comparação: Você vai notar no console que o ArrayList mantém
    todos os 5 nomes na ordem exata em que foram inseridos, enquanto o HashSet
    fica com apenas 3 nomes únicos (e possivelmente em outra ordem).*/
}
