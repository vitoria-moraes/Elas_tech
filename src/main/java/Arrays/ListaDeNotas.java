package Arrays;

public class ListaDeNotas {
    public static void main(String[] args) {
        /*int[] notas = {8, 6, 10, 7, 9};: Cria o array já com os valores preenchidos.
         i + 1: Ajusta o índice (que começa em 0) para exibir "Nota 1", "Nota 2", etc.
         notas[i]: Pega o valor correspondente a cada posição do array conforme o laço avança.*/

        int[] notas = {8, 6, 10, 7, 9};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = (double) soma / notas.length;
        System.out.println("Soma total: " + soma);
        System.out.println("Media: " + media);
    }
}
