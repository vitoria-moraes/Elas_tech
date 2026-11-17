package Polimorfismo;

public class Atividade5 {
    /*
    (herança — metodo que recebe a mãe)
    Crie um metodo na sua classe Main:
    static void mostrarFicha(Pessoa p) {
    p.apresentar();}
    Chame ele três vezes, passando a aluna, a professora e a estagiária.
    O metodo não sabe quem vai receber, e funciona pros três.
    */

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    public static void main(String[] args) {
        Aluna aluna = new Aluna();
        aluna.nome = "Ana";
        aluna.idade = 22;
        aluna.curso = "Java e IA";

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java e IA";

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Beatriz";
        estagiaria.idade = 20;

        mostrarFicha(aluna);
        mostrarFicha(professora);
        mostrarFicha(estagiaria);
    }
}

/*
Explicação Passo a Passo:
1. Parâmetro polimórfico (Pessoa p): Como Aluna, Professora e Estagiaria
   estendem Pessoa, todas elas são aceitas como argumento no metodo
   mostrarFicha(Pessoa p), sem precisarmos criar três métodos diferentes.
2. Despacho dinâmico: Na hora da execução, p.apresentar() chama o metodo
   específico de cada objeto passado (o apresentar() padrão da mãe para
   aluna e estagiaria, e o apresentar() sobrescrito para professora).
*/
