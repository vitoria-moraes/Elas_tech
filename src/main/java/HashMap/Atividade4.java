package HashMap;

import java.util.HashMap;

public class Atividade4 {
    public static void main(String[] args) {
        /*Enunciado: Crie um HashMap de estoque
        (produto -> quantidade) com dois itens.
        Use getOrDefault para mostrar a quantidade
        de um produto que existe e de um que não existe
        (devolvendo 0). Depois tente com get
        normal no que não existe e compare.*/

        // 1. Criando o HashMap de estoque (Chave: String -> Produto, Valor: Integer -> Quantidade)
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Teclado", 15);
        estoque.put("Mouse", 30);

        // 2. Usando getOrDefault em um produto que EXISTE (retorna 15)
        System.out.println("Quantidade de Teclado (getOrDefault): " + estoque.getOrDefault("Teclado", 0));

        // 3. Usando getOrDefault em um produto que NÃO EXISTE (retorna o valor padrão: 0)
        System.out.println("Quantidade de Monitor (getOrDefault): " + estoque.getOrDefault("Monitor", 0));

        // 4. Usando get normal no produto que NÃO EXISTE para comparar (retorna null)
        System.out.println("Quantidade de Monitor (get normal): " + estoque.get("Monitor"));
    }
    /*.getOrDefault(chave, valorPadrao): Busca a chave no mapa.
    Se ela existir ("Teclado"), devolve a quantidade cadastrada
    (15). Se não existir ("Monitor"), em vez de falhar ou devolver nulo,
    ele retorna o valor padrão que você escolheu no segundo parâmetro (0).
    Comparação com .get("Monitor"): O .get() tradicional
    devolve null quando não encontra a chave. Em sistemas reais
    (como cálculo de estoque), tentar fazer contas com null causa
    o famoso erro NullPointerException, por isso o getOrDefault é tão útil!*/
}
