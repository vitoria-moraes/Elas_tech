package Lambda;

/*
5 - Crie um metodo static void mostrarResultado(Operacao op, int valor) que imprime o retorno de op.aplicar(valor).
No main, chame mostrarResultado três vezes com três lambdas diferentes: dobro, quadrado e negativo.
*/

public class Atividade5 {
    public static void mostrarResultado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

    public static void main(String[] args) {
        mostrarResultado(n -> n * 2, 5);
        mostrarResultado(n -> n * n, 5);
        mostrarResultado(n -> -n, 5);
    }
}

/*
PASSO A PASSO:
1. mostrarResultado recebe a regra de cálculo (op) e o número (valor), aplicando a operação e imprimindo o resultado.
2. Chamamos três vezes com valor 5: dobro (10), quadrado (25) e negativo (-5).
*/