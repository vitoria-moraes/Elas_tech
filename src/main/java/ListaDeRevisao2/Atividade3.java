package ListaDeRevisao2;

public class Atividade3 {
    public static void main(String[] args) {
        /*Enunciado do Exercício: Com seu nome
        e sua idade em variáveis,
        imprima: "Ana tem 28 anos."
        (ou com os seus dados).*/

        /*System.out.printf(...): O metodo printf (print format)
        permite criar saídas formatadas usando especificadores
        de formato (placeholders) que são substituídos pelos valores
        das variáveis na mesma ordem em que aparecem.
        %s: É o especificador usado para valores do tipo String (texto).
        O nome "Vitória" vai entrar no lugar do %s.
        %d: É o especificador usado para números inteiros (int).
        O valor 23 vai ocupar o lugar do %d.
        %n: Representa a quebra de linha (equivalente ao \n),
        garantindo que o cursor vá para a próxima
        linha ao terminar a impressão.*/

        String nome = "Vitória";
        int idade = 23;

        System.out.printf("%s tem %d anos.%n", nome, idade);
    }
}
