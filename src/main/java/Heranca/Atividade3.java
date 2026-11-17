package Heranca;

public class Atividade3 {
    /*
    Crie a classe Professora, também filha de Pessoa, com o atributo
    disciplina e o metodo lancarNota(String aluna, double nota), que
    imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
    com %.1f.
    Na Main, crie uma aluna e uma professora, preencha os atributos de
    cada objeto e chame os métodos das duas.
    */

    public static void main(String[] args) {
        Aluna aluna = new Aluna();
        aluna.nome = "Vitória";
        aluna.idade = 23;
        aluna.curso = "Java";

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 35;
        professora.disciplina = "Programação Orientada a Objetos";

        aluna.apresentar();
        aluna.estudar();

        professora.apresentar();
        professora.lancarNota(aluna.nome, 9.5);
    }
}

/*
Explicação Passo a Passo:
1. Duas classes filhas da mesma mãe: Tanto Aluna quanto Professora usam
   'extends Pessoa', herdando nome, idade e apresentar() sem repetir código.
2. System.out.printf com %.1f: O printf permite formatar textos com marcadores
   (%s para String, %.1f para número decimal com uma casa após a vírgula e %n
   para pular linha).
3. Integração entre objetos: Passamos aluna.nome como argumento para o metodo
   lancarNota() da professora, imprimindo "Flora lançou nota 9.5 para Vitória".
*/
