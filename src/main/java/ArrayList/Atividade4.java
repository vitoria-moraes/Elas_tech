package ArrayList;

import java.util.ArrayList;

public class Atividade4 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma lista com quatro cidades.
        Remova a da posição 1 e imprima quantas sobraram.*/

        //1.Criando e preenchendo lista de cidades
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Leopoldo");
        cidades.add("Porto Alegre");
        cidades.add("Novo Hamburgo");
        cidades.add("Torres");

        //2.Removendo a da posicao 1
        cidades.remove("Porto Alegre");

        // 3. Imprimindo quantas cidades sobraram e a lista atualizada
        System.out.println("Quantidade de cidades restantes: " + cidades.size());
        System.out.println("Cidades que sobraram: " + cidades);

        /*.remove(1): O metodo .remove() apaga o elemento
        que está no índice informado. Como a contagem começa em 0,
         o índice 1 remove o segundo item adicionado ("Curitiba").
         Reorganização Automática: Uma das maiores vantagens do ArrayList é que,
         ao remover um item do meio da lista, todos os elementos seguintes dão um
         "passo para trás" automaticamente para fechar o buraco
         ("São Paulo" passa a ser a posição 1, e "Florianópolis" passa a ser a posição 2).
         .size(): Como tínhamos 4 cidades e removemos 1,
         o metodo .size() agora retornará 3.*/

    }
}
