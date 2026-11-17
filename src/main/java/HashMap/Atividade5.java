package HashMap;

import java.util.HashMap;

public class Atividade5 {
    public static void main(String[] args) {
        /*Enunciado: Crie um HashMap de notas
        com três alunas. Imprima o mapa e o tamanho.
        Remova uma delas e imprima de novo.*/

        // 1. Criando o HashMap de notas (Chave: String -> Aluna, Valor: Double -> Nota)
        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Vitória", 9.5);
        notas.put("Beatriz", 8.0);
        notas.put("Carla", 10.0);

        // 2. Imprimindo o mapa e o tamanho inicial
        System.out.println("Notas iniciais: " + notas);
        System.out.println("Tamanho inicial: " + notas.size());

        // 3. Removendo uma das alunas pela chave
        notas.remove("Beatriz");

        // 4. Imprimindo o mapa atualizado e o novo tamanho
        System.out.println("Notas após remoção: " + notas);
        System.out.println("Tamanho atualizado: " + notas.size());
    }
    /*.remove("Beatriz"): No HashMap, a remoção é
    feita informando a chave ("Beatriz"), o que apaga
    automaticamente tanto o nome dela quanto a nota associada (8.0).
    .size() Atualizado: Ao remover um par chave-valor,
    o tamanho do mapa cai de 3 para 2.*/
}
