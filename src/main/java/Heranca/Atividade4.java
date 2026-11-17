package Heranca;

public class Atividade4 {
    /*
    Na Professora, sobrescreva o apresentar() usando @Override, pra
    imprimir "Oi, sou [nome] e ensino [disciplina]."
    Chame apresentar() na aluna e na professora e compare as saídas.
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
        professora.apresentar();
    }
}

/*
Explicação Passo a Passo:
1. Sobrescrita (@Override): Como Aluna não sobrescreveu apresentar(), ela
   continua usando a versão padrão da classe mãe Pessoa ("Oi, sou Vitória
   e tenho 23 anos.").
2. Comportamento específico na Professora: Já a classe Professora reescreveu
   o metodo apresentar() com @Override para mostrar sua disciplina em vez da
   idade ("Oi, sou Flora e ensino Programação Orientada a Objetos.").
*/
