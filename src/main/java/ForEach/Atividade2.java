package ForEach;

import java.util.ArrayList;

public class Atividade2 {
    public static void main(String[] args) {
        /*
         Crie um ArrayList com 5 notas e imprima todas usando for-each.
         */

        // 1. Criando o ArrayList de notas (Double)
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7.0);
        notas.add(10.0);
        notas.add(6.5);

        // 2. Percorrendo a lista com for-each e imprimindo cada nota
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}

/*
 * Explicação Passo a Passo:
 * 1. ArrayList<Double>: Como notas escolares costumam ter casas decimais,
 *    usamos a classe empacotadora Double dentro dos sinais < >.
 * 2. for (Double nota : notas): A sintaxe do for-each é idêntica tanto para
 *    arrays normais quanto para ArrayList. A cada volta do laço, a variável
 *    'nota' recebe o próximo valor armazenado na lista e o imprime no console.
 */

