package ListaDeRevisao2;

public class Atividade12 {
    /*Enunciado 2: Crie um metodo dobro(int numero)
    que devolve o dobro. Mostre o resultado no main.*
     */

    public static int dobro(int numero){
        return numero * 2;
    }

    public static void main(String[] args) {
        int resultado = dobro(5);
        System.out.println("O dobro é: " + resultado);
    }
}
