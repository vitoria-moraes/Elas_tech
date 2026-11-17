package HashSet;

import java.util.HashSet;

public class Atividade5 {
    public static void main(String[] args) {
        /* Crie um HashSet com três frutas e percorra ele com for,
        imprimindo uma por linha.*/

        // 1. Criando o conjunto de frutas e adicionando três valores
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Manga");
        frutas.add("Morango");
        frutas.add("Abacaxi");

        // 2. Percorrendo o HashSet com o laço for-each e imprimindo uma fruta por linha
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        /*Por que usar o for-each (for (String fruta : frutas)):
        Como o HashSet não tem índices numéricos (0, 1, 2...),
        não conseguimos usar .get(i) dentro de um for tradicional.
        O laço for-each é a forma ideal, pois pega cada elemento
        diretamente do conjunto, um por um, guardando na variável temporária fruta.
        Impressão: A cada volta do laço, o System.out.println(fruta)
        exibe a fruta atual em uma linha separada.*/
    }
}
