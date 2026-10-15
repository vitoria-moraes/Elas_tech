package EstrtuturasDeRepeticao;

public class TabuadaComWhile { // Ou o nome da sua classe atual
    public static void main(String[] args) {
        int numero = 7; // O número que você quer a tabuada
        int i = 1;

        while (i <= 10) {
            int resultado = numero * i; // Aqui multiplica o 7 pelo contador (1, 2, 3...)
            System.out.println(resultado); // Mostra só o resultado da multiplicação
            i++;
        }
    }
}