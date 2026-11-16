package ArrayList;

import java.util.ArrayList;

public class Atividade3 {
    public static void main(String[] args) {
        /*nunciado: Crie uma lista com quatro nomes.
        Troque o nome da posição 2 por outro e imprima
        a lista antes e depois.*/

        // 1. Criando e preenchendo a lista com quatro nomes
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Vitoria");
        nomes.add("Maria");
        nomes.add("Luara");
        nomes.add("Murilo");

        // 2. Imprimindo a lista antes da alteração
        System.out.println("Lista posição original :" + nomes);

        // 3. Trocando o nome da posição 2 usando o metodo .set()
        nomes.set(2, "Samira");

        // 4. Imprimindo a lista depois da alteração
        System.out.println("Lista posição atualizada :" + nomes);

        /*.set(indice, novoValor): Este é o metodo utilizado no ArrayList
        para substituir um elemento existente sem alterar o tamanho da lista.
        Índices na Prática: Como a contagem começa em 0, o índice 2 corresponde
        ao terceiro elemento adicionado ("Beatriz"), que será substituído por "Vitória".
        Comparação: Imprimir a lista antes e depois confirma que os outros
        elementos permaneceram em suas posições originais
        e apenas o índice 2 foi atualizado.*/
    }
}
