package ForEach;

public class Atividade3 {
    public static void main(String[] args) {
        /*
         * Exercício 3:
         * Com o array de notas {8, 6, 10, 7}, use for-each para somar
         * todas e mostrar a soma e a média.
         */

        // 1. Criando o array de notas e a variável acumuladora para a soma
        int[] notas = {8, 6, 10, 7};
        int soma = 0;

        // 2. Percorrendo o array com for-each e acumulando cada nota na soma
        for (int nota : notas) {
            soma += nota;
        }

        // 3. Calculando a média (convertendo soma para double para não perder casas decimais)
        double media = (double) soma / notas.length;

        // 4. Exibindo os resultados
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
    }
}

/*
 * Explicação Passo a Passo:
 * 1. Variável acumuladora (int soma = 0): Precisa ser declarada fora e antes
 *    do laço para ir guardando o total acumulado a cada repetição.
 * 2. soma += nota: É a forma abreviada de escrever 'soma = soma + nota'.
 * 3. Cast para double ((double) soma / notas.length): Como 'soma' (31) e
 *    'notas.length' (4) são inteiros, dividir dois int em Java descartaria os
 *    decimais (dando 7 em vez de 7.75). O (double) garante o cálculo exato.
 */