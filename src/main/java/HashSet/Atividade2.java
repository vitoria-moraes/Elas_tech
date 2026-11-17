package HashSet;

import java.util.HashSet;
import java.util.Arrays;

public class Atividade2 {
    public static void main(String[] args) {
        /*Crie um HashSet de cores usando addAll. Depois use contains dentro
   de um if para avisar se a cor "verde" já está no conjunto ou não.*/

        // 1. Criando o conjunto de cores
        HashSet<String> cores = new HashSet<>();

        // 2. Adicionando várias cores de uma vez usando addAll e Arrays.asList
        cores.addAll(Arrays.asList("azul", "vermelho", "verde", "amarelo"));

        // 3. Verificando se "verde" está no conjunto com contains dentro de um if
        if (cores.contains("verde")) {
            System.out.println("A cor verde já está no conjunto!");
        } else {
            System.out.println("A cor verde NÃO está no conjunto.");
        }

    }
}
