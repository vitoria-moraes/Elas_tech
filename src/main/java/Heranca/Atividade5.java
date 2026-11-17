package Heranca;

public class Atividade5 {
    /*
    Faça uma cadeia de três níveis:
    - Funcionario, com o atributo nome e o metodo baterPonto()
    - Gerente extends Funcionario, com aprovarFerias(String quem)
    - Diretora extends Gerente, com definirMeta(String meta)
    Na Main, crie uma Diretora, preencha o nome dela
    (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
    Herança em cadeia: ela tem tudo que vem de cima.
    */

    public static void main(String[] args) {
        Diretora carla = new Diretora();
        carla.nome = "Carla";

        carla.baterPonto();
        carla.aprovarFerias("Vitória");
        carla.definirMeta("Aumentar as vendas em 20%");
    }
}

/*
Explicação Passo a Passo:
1. Herança multinível (em cadeia): Diretora herda de Gerente, que por sua
   vez herda de Funcionario. Isso cria uma hierarquia onde tudo que está nos
   níveis superiores desce automaticamente para a base.
2. Acesso total no mesmo objeto: Como Diretora está na ponta dessa cadeia,
   o objeto 'carla' possui o atributo 'nome' e o metodo baterPonto() (vindos
   de Funcionario), aprovarFerias() (vindo de Gerente) e definirMeta() (da
   própria Diretora).
*/