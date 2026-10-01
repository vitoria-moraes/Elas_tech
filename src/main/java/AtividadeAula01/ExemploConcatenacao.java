package AtividadeAula01;

public class ExemploConcatenacao {
    public static void main(String[] args) {
        String nome = "Samira peidorreira";
        String cidadeOndeMora = "Porto Alegre";
        int idade = 25;

        String produto = "Caneca";
        double preco = 12.50;
        double valorTotal = 50;
        int quantidade = 4;

        int valor1 = 15;
        int valor2 = 4;
        int resultado = valor1 + valor2;

        System.out.println("1) Exemplo Atividade com nome");
        System.out.println("Meu nome é " + nome + ", moro em " + cidadeOndeMora + " e tenho " + idade + " anos.");
        System.out.println("---------------------------------------------------------------");
        System.out.println("2) Exemplo Atividade com canecas");
        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$" + preco + " cada. Total : R$" + valorTotal);
        System.out.println("---------------------------------------------------------------");
        System.out.println("3) Exemplo Atividade com soma");
        System.out.println("A soma de " + valor1 + " e " + valor2 + " é igual a : " + resultado);
    }
}
