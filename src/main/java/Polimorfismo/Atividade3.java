package Polimorfismo;

/*
Exercício 3:
Crie a classe Professora, também filha de Pessoa, com o atributo
disciplina e o metodo lancarNota(String aluna, double nota), que
imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
com %.1f.

Na Main, crie uma aluna e uma professora e dê valor aos atributos
de cada objeto:
Professora flora = new Professora();
flora.nome = "Flora";
flora.idade = 30;
flora.disciplina = "Java e IA";

Faça o mesmo com a aluna e chame os métodos das duas.
*/

public class Atividade3 {
    public static void main(String[] args) {
        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 22;
        ana.curso = "Java e IA";

        flora.apresentar();
        flora.lancarNota(ana.nome, 9.5);

        ana.apresentar();
        ana.estudar();
    }
}

/*
Explicação Passo a Passo:
1. Polimorfismo por sobrescrita (@Override): Quando chamamos flora.apresentar()
   e ana.apresentar(), ambas executam o mesmo nome de metodo herdado de Pessoa,
   mas com comportamentos diferentes — Flora usa a versão sobrescrita (mostrando
   sua disciplina) e Ana usa a versão herdada padrão (mostrando sua idade).
2. Base para os próximos exercícios: Deixe Pessoa, Aluna e Professora nesse
   pacote, pois os exercícios 4, 5 e 7 vão reutilizar exatamente essa estrutura.
*/