package Lambda2;

/*
4 - Predicate
Predicate entra algo, sai boolean.
Crie um Predicate<Integer> que teste se um número é maior que 10. Teste passando o número 5 e depois o número 15 usando o metodo .test(). Imprima ambos os resultados na tela (true ou false).
Crie um Predicate<String> que valide se um texto está vazio usando texto.isEmpty(). Teste com uma String vazia "" e com uma String preenchida "Java".
*/

import java.util.function.Predicate;

public class AtividadePredicate {
    public static void main(String[] args) {
        Predicate<Integer> maiorQueDez = numero -> numero > 10;
        System.out.println("O número 5 é maior que 10? " + maiorQueDez.test(5));
        System.out.println("O número 15 é maior que 10? " + maiorQueDez.test(15));

        Predicate<String> textoVazio = texto -> texto.isEmpty();
        System.out.println("A String \"\" está vazia? " + textoVazio.test(""));
        System.out.println("A String \"Java\" está vazia? " + textoVazio.test("Java"));
    }
}

/*
PASSO A PASSO:
1. Predicate<T> recebe um argumento e sempre devolve um boolean (true ou false).
2. O método .test() avalia a condição definida na lambda (é o mesmo usado por baixo dos panos no .filter() das Streams).
*/