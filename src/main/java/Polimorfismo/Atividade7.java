package Polimorfismo;

public class Atividade7 {
    /*
    (a armadilha)
    Na Professora, troque o apresentar() sobrescrito por este,
    com um parâmetro a mais e SEM o @Override:
    void apresentar(String cargo) {
    System.out.println("Oi, sou " + nome + ", " + cargo);
    }
    Rode o exercício 3 de novo. O que a professora imprime agora?
    Deu algum erro?
    Depois coloque o @Override nesse metodo e veja o que o Java diz.
    Essa questão mostra por que o @Override existe.
    */

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
1. O que a professora imprime agora sem o @Override?
   "Oi, sou Flora e tenho 30 anos."
   Deu algum erro? Não! Compilou e rodou sem nenhum aviso.
2. Por que isso aconteceu?
   Ao adicionar o parâmetro (String cargo), a assinatura do metodo mudou. Em vez
   de sobrescrever apresentar() da classe Pessoa, você acabou criando uma
   SOBRECARGA (um segundo metodo apresentar(String cargo)). Quando flora.apresentar()
   é chamado sem argumentos, o Java executa o apresentar() original da mãe Pessoa.
3. O que acontece ao colocar @Override em void apresentar(String cargo)?
   O compilador dá erro imediato ("Method does not override method from its
   superclass"), avisando que não existe nenhum apresentar(String) na classe
   Pessoa para ser sobrescrito — salvando você de um bug silencioso.
*/