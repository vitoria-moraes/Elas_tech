package HashMap;

import java.util.HashMap;

public class Atividade1 {
    public static void main(String[] args) {
        /* Enunciado: Crie um HashMap de nomes
         e idades com três pessoas. Imprima o mapa
         inteiro e depois use get para mostrar a
         idade de uma delas.*/

        // 2. Criando o HashMap (Chave: String -> Nome, Valor: Integer -> Idade)
        HashMap<String, Integer> pessoas = new HashMap<>();

        // 3. Adicionando três pessoas com o metodo .put(chave, valor)
        pessoas.put("Vitória", 23);
        pessoas.put("Carlos", 28);
        pessoas.put("Beatriz", 21);

        // 4. Imprimindo o mapa inteiro
        System.out.println("Mapa completo: " + pessoas);

        // 5. Usando .get(chave) para buscar a idade de uma pessoa específica
        System.out.println("Idade da Vitória: " + pessoas.get("Vitória"));
    }

    /*HashMap<String, Integer>: Diferente das listas e conjuntos
    que guardam apenas um dado por posição, o HashMap trabalha
    com pares Chave → Valor. Note que para números inteiros usamos
    a classe empacotadora Integer (o Java não aceita tipos
    primitivos como int dentro dos sinais < >).
    .put(chave, valor): É o equivalente ao .add() nas listas/conjuntos.
    Aqui vinculamos cada nome (chave única) à sua respectiva idade (valor).
    .get("Vitória"): Ao informar a chave exata, o
    HashMap devolve imediatamente o valor associado a ela (23).*/
}
