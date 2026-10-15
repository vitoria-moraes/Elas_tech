package ListaDeRevisao;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        // Regra 3: Use while para manter o programa rodando até escolher sair (2)
        while(true){
            System.out.println("Pressione 1 continuar, 2 para sair");
            opcao = sc.nextInt();

            // Regra 4: Use switch para tratar as opções do menu (com break e default)
            switch(opcao){
                case 1:
                    // Regra 5: Instancie a Aluna dentro do loop (cada volta cria uma nova)
                    AlunaDesafio aluna  = new AlunaDesafio();

                    // Regra 5: Instancie a Aluna dentro do loop (cada volta cria uma nova)
                    System.out.println("Nota 1");
                    aluna.nota = sc.nextInt();

                    System.out.println("Nota 2:");
                    aluna.nota2 = sc.nextDouble();

                    sc.nextLine();

                    System.out.println("Nome da Aluna:");
                    aluna.nome = sc.nextLine();

                    // Regra 6: Calcule a média dentro do programa
                    aluna.media = (aluna.nota + aluna.nota2) / 2;

                    // Regra 7: Use if / else para definir se passou (média 6 ou mais = true)
                    if (aluna.media >= 6.0) {
                        aluna.aprovado = true;
                    } else {
                        aluna.aprovado = false;
                    }
                    System.out.printf(
                            "O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua média final foi %.1f. Aluna aprovada: %b%n",
                            aluna.nome, aluna.nota, aluna.nota2, aluna.media, aluna.aprovado
                    );
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    sc.close();

                    // Encerra
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
