package ArrayList;

import java.util.ArrayList;

public class Atividade1 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma lista vazia de nomes.
        Adicione três nomes e imprima a lista inteira.*/

        // 2. Criando uma lista vazia de Strings
        ArrayList<String> nomes = new ArrayList<>();

        // 3. Adicionando três nomes usando o metodo .add()
        nomes.add("Vitória");
        nomes.add("Samira");
        nomes.add("Maria");

        // 4. Imprimindo a lista inteira de uma vez
        System.out.println("Lista de nomes: " + nomes);

    }
}

         /*ArrayList<String> nomes = new ArrayList<>();:
         ArrayList cria uma lista que pode crescer ou diminuir
         de tamanho dinamicamente (diferente dos arrays tradicionais que têm tamanho fixo).
         O <String> entre os sinais de maior e menor define que essa lista vai
         armazenar exclusivamente textos (String).
         .add("..."): É o metodo que adiciona novos elementos sempre no final da lista.
         Impressão Direta (System.out.println(nomes)): O Java já sabe formatar
         o ArrayList automaticamente, exibindo todos os elementos entre
         colchetes separados por vírgula.*/
