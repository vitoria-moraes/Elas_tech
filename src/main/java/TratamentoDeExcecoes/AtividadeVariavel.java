package TratamentoDeExcecoes;

public class AtividadeVariavel {
    public static void main(String[] args) {
        /*4 — Crie uma variável String nome = null;
e tente imprimir nome.length().
Trate a NullPointerException
e mostre "O nome não foi preenchido."*/

        String nome = null; // A variável foi declarada, mas não aponta para nenhum objeto (está nula)

        try {
            // Tentativa de chamar um metodo em um objeto que está null
            System.out.println("Tamanho do nome: " + nome.length());

        } catch (NullPointerException e) {
            // Bloco executado quando tentamos usar algo que é null
            System.out.println("O nome não foi preenchido.");
        }
    }
}
