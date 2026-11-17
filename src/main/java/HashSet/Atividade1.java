package HashSet;

import java.util.HashSet;

public class Atividade1 {
    public static void main(String[] args) {
        /*Crie um HashSet de nomes e adicione quatro valores, sendo um deles
   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
   com o repetido.*/

        // 2. Criando um conjunto (HashSet) de Strings
        HashSet<String> nomes = new HashSet<>();

        // 3. Adicionando quatro valores, sendo "Vitória" repetido
        nomes.add("Vitória");
        nomes.add("Carlos");
        nomes.add("Beatriz");
        nomes.add("Vitória"); // Valor duplicado

        // 4. Imprimindo o conjunto e o tamanho total
        System.out.println("Conjunto de nomes: " + nomes);
        System.out.println("Tamanho do conjunto: " + nomes.size());
    }
    /*Sem duplicatas (HashSet): A principal característica
    de um Set (conjunto) em Java é que ele não permite elementos repetidos.
    Quando você tenta adicionar "Vitória" pela segunda vez, o
    metodo .add() simplesmente ignora a inserção
    (retornando false internamente) e mantém apenas uma cópia.
    Tamanho (.size()): Mesmo tendo chamado .add() 4 vezes, o .size()
    será 3, pois a duplicata não entrou no conjunto.
    Ordem dos elementos: Diferente do ArrayList, o HashSet não garante
    a ordem em que você inseriu os nomes, pois ele organiza os dados
    internamente usando tabelas de espalhamento
    (hash) para tornar as buscas ultra rápidas.*/
}
