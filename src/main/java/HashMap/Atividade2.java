package HashMap;

import java.util.HashMap;

public class Atividade2 {
    public static void main(String[] args) {

        /*Enunciado: Crie um HashMap de produtos e preços.
        Coloque "café" com valor 5.00, imprima, e depois
        faça put de "café" DE NOVO com valor 7.50. Imprima
        outra vez e veja o que aconteceu com o tamanho.*/

        // 1. Criando o HashMap (Chave: String -> Produto, Valor: Double -> Preço)
        HashMap<String, Double> produtos = new HashMap<>();

        // 2. Inserindo "café" com preço 5.00
        produtos.put("café", 5.00);
        System.out.println("Mapa inicial: " + produtos + " | Tamanho: " + produtos.size());

        // 3. Inserindo "café" DE NOVO com preço 7.50
        produtos.put("café", 7.50);
        System.out.println("Mapa atualizado: " + produtos + " | Tamanho: " + produtos.size());
    }
    /*Chaves Únicas ("café"): No HashMap, não existem
    chaves repetidas. Quando você faz .put() usando uma
    chave que já existe no mapa, ele não cria um segundo item;
    em vez disso, ele sobrescreve (atualiza) o
    valor antigo (5.00) pelo novo (7.50).
    Tamanho Mantido (.size()): Por causa dessa substituição,
    o tamanho do mapa permanece 1 nas duas impressões.*/
}
