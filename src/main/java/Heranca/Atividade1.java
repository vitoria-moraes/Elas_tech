package Heranca;

public class Atividade1 {
    public static void main(String[] args) {
        /*
        Crie a classe Pessoa com os atributos nome e idade, e o metodo
        apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
        Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
        Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
        Repare: você não escreveu nome, idade nem apresentar() na Aluna,
        e os três funcionaram.
        */
                Aluna aluna = new Aluna();
                aluna.nome = "Vitória";
                aluna.idade = 23;

                aluna.apresentar();
            }
        }

/*
Explicação Passo a Passo:
1. extends Pessoa: A palavra-chave 'extends' estabelece uma relação de herança
   ("Aluna É UMA Pessoa"). Com isso, Aluna herda automaticamente todos os
   atributos (nome, idade) e métodos (apresentar) não privados de Pessoa.
2. Reuso sem repetição: Mesmo com o corpo da classe Aluna totalmente vazio,
   conseguimos preencher aluna.nome, aluna.idade e chamar aluna.apresentar()
   normalmente na classe principal.
*/
