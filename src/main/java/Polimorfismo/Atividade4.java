package Polimorfismo;

public class Atividade4 {
    /*
    (herança — quem não sobrescreve)
    Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve
    o apresentar() e não acrescenta nada.
    Na Main, crie o objeto, dê valor aos atributos, guarde ele numa
    variável do tipo da mãe e chame o metodo apresentar().
    O que saiu? Por quê?
    */
    public static void main(String[] args) {
        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Beatriz";
        estagiaria.idade = 20;

        // Guardando o objeto Estagiaria em uma variável do tipo da mãe (Pessoa)
        Pessoa pessoa = estagiaria;

        pessoa.apresentar();
    }
}

/*
Explicação Passo a Passo:
1. O que saiu na tela:
   "Oi, sou Beatriz e tenho 20 anos."
2. Por quê?
   Mesmo guardando o objeto dentro de uma referência do tipo da mãe
   (Pessoa pessoa = estagiaria;), o Java sempre olha para o objeto real
   criado na memória (new Estagiaria()) na hora de executar o método.
   Como Estagiaria não tem uma versão própria de apresentar() sobrescrita,
   o Java sobe na hierarquia de herança e executa o apresentar() original
   da classe mãe Pessoa.
*/