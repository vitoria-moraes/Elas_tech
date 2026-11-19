package Lambda;

    /*
1 - Depois, em uma classe com main, crie uma variável desse tipo usando lambda e chame o metodo. O corpo da lambda deve imprimir "oi".
*/
  public class Atividade1 {
        public static void main(String[] args) {
            Saudacao saudacao = () -> System.out.println("oi");
            saudacao.executar();
        }
    }

/*
PASSO A PASSO:
1. Como executar() não recebe parâmetros, usamos parênteses vazios () -> seguidos da ação.
2. Chamamos saudacao.executar() para disparar a impressão.
*/

