package Stream;

/*
1 - Dada uma lista de números inteiros de 1 a 6, use Streams para filtrar apenas os números pares
e salve o resultado em uma nova lista.
*/

import java.util.List;

public class StreamNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Números pares: " + pares);
    }
}

/*
PASSO A PASSO:
1. Abre o fluxo de dados com .stream().
2. Usa .filter(n -> n % 2 == 0) para manter apenas os números divisíveis por 2.
3. Coleta o resultado em uma nova lista usando .toList() (ou .collect(Collectors.toList())).
*/
