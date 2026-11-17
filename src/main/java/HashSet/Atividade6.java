package HashSet;

import java.util.HashSet;

public class Atividade6 {
    public static void main(String[] args) {
        /* Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
   imprima o isEmpty() de novo.*/

        // 1. Criando um HashSet vazio
        HashSet<String> conjunto = new HashSet<>();

        // 2. Verificando se está vazio antes de adicionar algo (retorna true)
        System.out.println("O conjunto está vazio? " + conjunto.isEmpty());

        // 3. Adicionando um valor ao conjunto
        conjunto.add("Java");

        // 4. Verificando novamente se está vazio (agora retorna false)
        System.out.println("O conjunto está vazio agora? " + conjunto.isEmpty());
    }
    /*.isEmpty(): Retorna um valor booleano
    (true se a coleção não tiver nenhum elemento,
    e false assim que houver pelo menos um item cadastrado).
    Ciclo de Vida: Na primeira impressão, como o
    HashSet acabou de ser instanciado sem itens, o console exibe true.
    Após o .add("Java"), o metodo passa a retornar false.*/
}
