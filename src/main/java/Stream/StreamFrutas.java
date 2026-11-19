package Stream;

/*
2 - Dada uma lista com nomes de frutas em letras minúsculas, use o map para transformar
todas as palavras em letras maiúsculas e imprima cada uma na tela.
*/

import java.util.List;

public class StreamFrutas {
    public static void main(String[] args) {
        List<String> frutas = List.of("banana", "maçã", "uva", "morango", "manga");

        frutas.stream()
                .map(fruta -> fruta.toUpperCase())
                .forEach(fruta -> System.out.println(fruta));
    }
}

/*
PASSO A PASSO:
1. Usa .map(fruta -> fruta.toUpperCase()) para transformar cada elemento da stream para letras maiúsculas.
2. Usa a operação terminal .forEach() para imprimir cada fruta transformada no console.
*/