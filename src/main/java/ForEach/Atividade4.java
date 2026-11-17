package ForEach;

import java.util.ArrayList;

public class Atividade4 {
    public static void main(String[] args) {
            /*
            Exercício 4:
            Crie um ArrayList de preços com 5 valores e use for-each para imprimir
            só os que forem maiores que 50.
            */

        // 1. Criando o ArrayList de preços e adicionando 5 valores
        ArrayList<Double> precos = new ArrayList<>();
        precos.add(25.90);
        precos.add(89.99);
        precos.add(15.00);
        precos.add(120.50);
        precos.add(50.00);

        // 2. Percorrendo com for-each e filtrando com if (> 50)
        System.out.println("Preços maiores que 50:");
        for (Double preco : precos) {
            if (preco > 50) {
                System.out.println("R$ " + preco);
            }
        }
    }
}
