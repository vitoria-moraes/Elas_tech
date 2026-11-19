package Lambda2;

/*
1 - Runnable
Runnable não recebe nada, não devolve nada.
Crie uma Runnable que imprima "executando tarefa". Declare numa variável, execute com .run().
Depois crie uma segunda Runnable e execute as duas em sequência no main.
*/

public class AtividadeRunnable {
    public static void main(String[] args) {
        Runnable tarefa1 = () -> System.out.println("Executando tarefa");
        Runnable tarefa2 = () -> System.out.println("Executando segunda tarefa");

        tarefa1.run();
        tarefa2.run();
    }
}

/*
PASSO A PASSO:
1. Runnable é uma interface funcional do java.lang que não recebe argumentos () e não retorna valor (void).
2. Cada variável guarda uma ação diferente e é executada com o método .run().
*/