package Heranca;

public class Atividade2 {
    /*
    Acrescente na Aluna o atributo curso e o metodo estudar(), que
    imprime "[nome] está estudando [curso]."
    Preencha os três atributos no objeto e chame os dois métodos.
    Repare que o estudar() usa o nome, que veio da mãe.
    */

    public static void main(String[] args) {
        Aluna aluna = new Aluna();
        aluna.nome = "Vitória";
        aluna.idade = 23;
        aluna.curso = "Java e Inteligência Artificial";

        aluna.apresentar();
        aluna.estudar();
    }
}

/*
Explicação Passo a Passo:
1. Especialização da classe filha: Além de tudo o que herda de Pessoa, a
   classe Aluna agora tem suas próprias características (curso e estudar()).
2. Uso de atributo herdado dentro da filha: Dentro do metodo estudar(),
   usamos 'nome' diretamente sem precisar declará-lo novamente em Aluna, pois
   ele já existe na superclasse Pessoa.
*/