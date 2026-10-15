package VariaveisConcatenacao;

public class ExemploVariaveis {
    public static void main(String[] args) {
        //textos
        String nome = "Vitória";
        String cep = "90230-150";
        String cidade = "Porto Alegre";
        String numeroTelefone = "(51)993318530";
        String profissao = "Estudante";
        String dataDeNascimento = "23/03/2003";

        //numeros inteiros
        int idade = 25;
        int temperatura = 18;

        //numeros decimais
        double altura = 1.58;
        double peso = 79.50;
        double nota = 7.5;

        //true or false
        boolean ehFumante = false;
        boolean temCNH = true;

        System.out.println("-----STRING = TEXTOS-----");
        System.out.println("Nome : " + nome);
        System.out.println("Cep : " + cep);
        System.out.println("Cidade : " + cidade);
        System.out.println("Número de Telefone : " + numeroTelefone);
        System.out.println("Profissão : " + profissao);
        System.out.println("Data de Nascimento : " + dataDeNascimento);

        System.out.println("-----INT = NÚMEROS INTEIROS-----");
        System.out.println("Idade : " + idade);
        System.out.println("Temperatura : " + temperatura);

        System.out.println("-----DOUBLE = NÚMEROS QUEBRADOS-----");
        System.out.println("Altura : " + altura);
        System.out.println("Peso : " + peso);
        System.out.println("Nota : " + nota);

        System.out.println("-----BOOLEAN = VERDADEIRO OU FALSO-----");
        System.out.println("Fumante : " + false);
        System.out.println("Tem CNH : " + true);
    }
}