package ListaDeRevisao;

public class Atividade2 {
    public static void main(String[] args) {

            for(int i = 1; i <= 15; i++){
                System.out.println(i);


                /*i % 2 == 0: O operador % (módulo) calcula o resto da divisão.
                Se o resto da divisão de i por 2 for 0,
                o número é par; caso contrário, é ímpar.*/

                if(i % 2 == 0){
                    System.out.println(i + " É par");
                } else {
                    System.out.println(i + " É ímpar");
                }
            }
        }
    }
