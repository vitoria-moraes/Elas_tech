package AtividadeAula05;

public class While {
    public static void main(String[] args) {

        int i = 1; //inicializacao da variavel

        while (i <= 10){ //condicao de parada dentro dos parenteses
            System.out.println(i);
            i++; //incremento deve ser feito dentro do laco(senao vira loop infinito)
        }
    }
}
