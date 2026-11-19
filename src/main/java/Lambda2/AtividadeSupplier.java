package Lambda2;

/*
3 - Supplier
Supplier nada entra, algo sai.
Crie um Supplier<String> que devolva o texto "Aviso: O sistema está online!". Chame o metodo .get() e imprima o resultado.
Crie um Supplier<Integer> que gere e devolva um número aleatório (use new Random().nextInt(100)). Chame o .get() duas vezes seguidas e imprima os resultados para ver que ele gera números diferentes a cada chamada.
*/

import java.util.Random;
import java.util.function.Supplier;

public class AtividadeSupplier {
    public static void main(String[] args) {
        Supplier<String> avisoSistema = () -> "Aviso: O sistema está online!";
        System.out.println(avisoSistema.get());

        Supplier<Integer> geradorNumero = () -> new Random().nextInt(100);
        System.out.println("Primeira chamada: " + geradorNumero.get());
        System.out.println("Segunda chamada: " + geradorNumero.get());
    }
}

/*
PASSO A PASSO:
1. Supplier<T> não recebe parâmetros () e retorna um valor do tipo T.
2. Cada chamada ao método .get() executa o corpo da lambda novamente, gerando um novo número aleatório.
*/