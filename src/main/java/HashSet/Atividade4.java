package HashSet;

import java.util.HashSet;

public class Atividade4 {
    public static void main(String[] args) {
        /* Crie um HashSet com três CPFs e imprima.
        Depois remova um deles e
        imprima de novo, junto com o tamanho.*/

        // 1. Criando o conjunto de CPFs e adicionando três valores
        HashSet<String> cpfs = new HashSet<>();
        cpfs.add("111.222.333-44");
        cpfs.add("555.666.777-88");
        cpfs.add("999.888.777-66");

        // 2. Imprimindo o conjunto inicial
        System.out.println("CPFs cadastrados: " + cpfs);

        // 3. Removendo um dos CPFs pelo seu valor exato
        cpfs.remove("555.666.777-88");

        // 4. Imprimindo o conjunto atualizado e o novo tamanho
        System.out.println("CPFs após remoção: " + cpfs);
        System.out.println("Quantidade restante: " + cpfs.size());

    }
}
