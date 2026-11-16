package ArrayList;

import java.util.ArrayList;

public class Atividade5 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma lista com seis nomes e imprima
        todos usando um laço, no formato "0: Ana".
        (Dica: i + ": " + comando para pegar posição da lista)*/

        //1.lista com os nomes preenchida
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Samira");
        nomes.add("Dolores");
        nomes.add("Maria");
        nomes.add("Vitória");
        nomes.add("Luara");
        nomes.add("Murilo");

        // 2. Percorrendo a lista usando um laço for tradicional
        for(int i =  0; i < nomes.size(); i++ ){
            System.out.println(i + " : " + nomes.get(i));

            /*i < nomes.size(): No laço for, usamos .size() como limite
            para que a variável i vá de 0 até 5 (o último índice
            válido de uma lista com 6 itens).
            nomes.get(i): A cada volta do laço, o metodo .get(i) recupera o
            nome que está na posição atual de i.
            Formatação: Concatenamos o índice i com ": " e o nome correspondente,
            gerando exatamente a saída esperada (0: Ana, 1: Bruno, etc.).*/
        }
    }
}
