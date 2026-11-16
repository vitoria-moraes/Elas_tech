package ListaDeRevisao2;

public class Desafio {
    /*Enunciado:
    Crie um metodo ehMaiorDeIdade(int idade) que devolve true
    (se for 18 ou mais) ou false (se for menor).
     Depois crie outro metodo, liberarEntrada(int idade), que chama
     o primeiro e imprime se a pessoa pode entrar ou não.
     No main, chame apenas o segundo metodo*/

    // 1. Metodo que retorna true ou false baseado na idade
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    // 2. Metodo que chama o primeiro metodo dentro de um if para decidir a mensagem
    public static void liberarEntrada(int idade) {
        if (ehMaiorDeIdade(idade)) {
            System.out.println("Entrada permitida! Seja bem-vinda.");
        } else {
            System.out.println("Entrada negada! Menor de idade.");
        }
    }

    public static void main(String[] args) {
        liberarEntrada(18);
        liberarEntrada(16);
    }
}