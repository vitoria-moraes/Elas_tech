package Lambda2;
/*
5 - Function
Function entra um tipo, sai outro.
Crie uma Function<Integer, String> que receba um número e devolva o texto "Nota fiscal nº: " + numero. Use o metodo .apply(1542) e imprima o resultado.
Crie uma Function<String, Integer> que receba uma palavra e devolva a quantidade de letras que ela tem usando .length(). Teste com .apply("Professor") e imprima o número gerado.
*/

import java.util.function.Function;

public class AtividadeFunction {
    public static void main(String[] args) {
        Function<Integer, String> formatarNota = numero -> "Nota fiscal nº: " + numero;
        String notaFormatada = formatarNota.apply(1542);
        System.out.println(notaFormatada);

        Function<String, Integer> contarLetras = palavra -> palavra.length();
        Integer totalLetras = contarLetras.apply("Professor");
        System.out.println("A palavra 'Professor' tem " + totalLetras + " letras.");
    }
}

/*
PASSO A PASSO:
1. Function<T, R> recebe um parâmetro do tipo T (entrada) e retorna um valor do tipo R (saída).
2. O método .apply() executa a transformação (é a mesma interface usada por baixo dos panos no .map() das Streams).
*/