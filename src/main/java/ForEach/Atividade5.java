package ForEach;

import java.util.ArrayList;

public class Atividade5 {
    public static void main(String[] args) {
        /*
Exercício 5:
Crie um ArrayList de palavras com 6 palavras e use for-each para contar
quantas têm mais de 5 letras.
*/
        // 1. Criando o ArrayList de palavras e adicionando 6 palavras
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Java");
        palavras.add("Programação");
        palavras.add("Código");
        palavras.add("Dados");
        palavras.add("Algoritmo");
        palavras.add("Tela");

        // 2. Variável contadora para guardar quantas palavras atendem à condição
        int contador = 0;

        // 3. Percorrendo com for-each e verificando o tamanho (.length() > 5)
        for (String palavra : palavras) {
            if (palavra.length() > 5) {
                contador++;
            }
        }

        // 4. Imprimindo o total encontrado
        System.out.println("Quantidade de palavras com mais de 5 letras: " + contador);
    }
}

/*
Explicação Passo a Passo:
1. int contador = 0: Variável criada antes do laço para contar quantas palavras
   passam no teste.
2. palavra.length() > 5: O metodo .length() retorna o total de caracteres da
   String atual. Se for maior que 5 ("Programação", "Código", "Algoritmo"),
   incrementamos o contador (contador++).
*/