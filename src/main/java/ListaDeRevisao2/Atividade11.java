package ListaDeRevisao2;

public class Atividade11 {
    /*Enunciado 1: Crie um metodo
    saudacao(String nome) que imprime "Olá, [nome]!".
    Chame três vezes com nomes diferentes.*/

    public static void saudacao(String nome){
        System.out.println("Olá, " + nome + "!");

    }
    public static void main(String[] args) {
        saudacao("Maria");
        saudacao("Samira");
        saudacao("Vitória");

    }
}


