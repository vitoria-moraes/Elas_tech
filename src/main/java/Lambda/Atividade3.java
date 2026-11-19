package Lambda;

/*
3 - Crie três lambdas: soma, multiplicação e a que retorna o maior dos dois. Chame as três e imprima os resultados.
*/

public class Atividade3 {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maior = (a, b) -> (a > b) ? a : b;

        System.out.println("Soma: " + soma.calcular(10, 5));
        System.out.println("Multiplicação: " + multiplicacao.calcular(10, 5));
        System.out.println("Maior: " + maior.calcular(10, 5));
    }
}

/*
PASSO A PASSO:
1. Quando a lambda tem uma única expressão com retorno, o "return" fica implícito.
2. Para o maior número, usamos o operador ternário (a > b) ? a : b (também funcionaria com Math.max(a, b)).
*/
