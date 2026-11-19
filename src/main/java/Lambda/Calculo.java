package Lambda;

/*
3 - Interface Calculo com int calcular(int a, int b).
Crie três lambdas: soma, multiplicação e a que retorna o maior dos dois. Chame as três e imprima os resultados.
*/

@FunctionalInterface
public interface Calculo {
    int calcular(int a, int b);
}

/*
PASSO A PASSO:
1. Interface funcional que recebe dois inteiros (a, b) e retorna um int.
*/
