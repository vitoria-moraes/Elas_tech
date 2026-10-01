package AtividadeAula03;

public class Desafio {
    public static void main(String[] args) {
        //Desafio: Crie variáveis para três notas de uma aluna.
        // Calcule a média e mostre: "Aprovada" se for 7 ou mais,
        // "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5.
        // Mostre também a média na tela.
        // Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3);

        System.out.printf("Sua média é : %.2f:\n", media);

        if (media >= 7.0) {
            System.out.printf("Situação: %s (Média >= 7.0)\n", "Aprovada");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("Situação: %s (Média entre 5.0 e 6.9)\n", "Recuperação");
        } else {
            System.out.printf("Situação: %s (Média abaixo de 5.0)\n", "Reprovada");
        }
    }
}
