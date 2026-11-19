package Lambda;
/*
2 - Crie duas variáveis diferentes desse tipo usando duas lambdas — uma que imprime o texto em maiúsculo, outra que imprime em minúsculo. Chame as duas.
*/

public class Atividade2 {
    public static void main(String[] args) {
        Impressora maiuscula = texto -> System.out.println(texto.toUpperCase());
        Impressora minuscula = texto -> System.out.println(texto.toLowerCase());

        maiuscula.imprimir("Java Lambda");
        minuscula.imprimir("Java Lambda");
    }
}

/*
PASSO A PASSO:
1. A primeira lambda transforma a String usando toUpperCase() e a segunda usa toLowerCase().
2. Chamamos o mesmo metodo imprimir() nas duas variáveis, obtendo comportamentos diferentes.
*/