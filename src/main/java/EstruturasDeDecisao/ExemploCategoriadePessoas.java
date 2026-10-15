package EstruturasDeDecisao;

public class ExemploCategoriadePessoas {
    public static void main(String[] args) {
        //1 — Crie uma variável idade e mostre a categoria de uma pessoa:
        // menos de 13 anos é "Criança",
        // de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".

        int idade1 = 13;
        int idade2 = 17;
        int idade4 = 18;
        int idade5 = 60;

        if(idade1 <= idade2){
            System.out.println("Esta pessoa é uma criança");
        } else {
            System.out.println("Esta pessoa é uma adolescente");
        }
    }
}
