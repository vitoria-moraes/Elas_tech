package Lambda;

/*
4 - Crie um metodo static void repetir(Acao acao) que chama acao.executar() duas vezes.
No main, chame repetir passando uma lambda que imprime "oi".
Repare que você não cria variável, a lambda vai direto como argumento.
*/

public class Atividade4 {
    public static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    public static void main(String[] args) {
        repetir(() -> System.out.println("oi"));
    }
}

/*
PASSO A PASSO:
1. O método repetir recebe uma Acao e executa duas vezes seguidas.
2. No main, passamos () -> System.out.println("oi") diretamente dentro dos parênteses da chamada.
*/