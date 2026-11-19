package Lambda;

/*
5 - Interface Operacao com int aplicar(int n).
Crie um metodo static void mostrarResultado(Operacao op, int valor) que imprime o retorno de op.aplicar(valor).
No main, chame mostrarResultado três vezes com três lambdas diferentes: dobro, quadrado e negativo.
Aqui você vê lambda com retorno entrando por parâmetro — as duas coisas juntas.
*/

@FunctionalInterface
public interface Operacao {
    int aplicar(int n);
}

/*
PASSO A PASSO:
1. Interface funcional que recebe um int e devolve um int transformado.
*/