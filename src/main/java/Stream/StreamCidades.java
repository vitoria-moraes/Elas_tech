package Stream;

/*
3 - Dada uma lista de nomes de cidades, filtre apenas as cidades que começam com a letra "S"
e conte quantas cidades passaram pelo filtro.
*/

import java.util.List;

public class StreamCidades {
    public static void main(String[] args) {
        List<String> cidades = List.of("São Paulo", "Porto Alegre", "Salvador", "Curitiba", "Santos");

        long totalCidadesComS = cidades.stream()
                .filter(cidade -> cidade.startsWith("S"))
                .count();

        System.out.println("Quantidade de cidades que começam com S: " + totalCidadesComS);
    }
}

/*
PASSO A PASSO:
1. Filtra as cidades usando .filter(cidade -> cidade.startsWith("S")).
2. Usa a operação terminal .count() (que retorna um long) para contar quantos itens sobraram após o filtro.
*/
