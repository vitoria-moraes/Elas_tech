package Polimorfismo;

public class Polimorfismo {
    /*1. (mesma classe — muda a QUANTIDADE de parâmetros)

   Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
   - recebe um double (lado do quadrado)  -> lado * lado
   - recebe dois double (base e altura)   -> base * altura
   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio

   Chame os três na Main e imprima os resultados.

2. (mesma classe — muda o TIPO do parâmetro)

   Crie a classe Painel com QUATRO métodos chamados exibir, cada um
   recebendo um tipo diferente: String, int, boolean e double.
   Cada um imprime de um jeito, dizendo que tipo recebeu.

   Chame os quatro.

   Depois pense: por que o System.out.println() aceita texto, número,
   boolean e objeto, ao invés de ter um método println para cada? É exatamente isso que vocês acabaram de fazer.

3. Crie a classe Professora, também filha de Pessoa, com o atributo
   disciplina e o método lancarNota(String aluna, double nota), que
   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
   com %.1f.

   Na Main, crie uma aluna e uma professora e dê valor aos atributos
   de cada objeto:

   Professora flora = new Professora();
   flora.nome = "Flora";
   flora.idade = 30;
   flora.disciplina = "Java e IA";

   Faça o mesmo com a aluna e chame os métodos das duas.

4. (herança — quem não sobrescreve)

   Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve
   o apresentar() e não acrescenta nada.

   Na Main, crie o objeto, dê valor aos atributos, guarde ele numa
   variável do tipo da mãe e chame o método apresentar().

   O que saiu? Por quê?

5. (herança — método que recebe a mãe)

   Crie um método na sua classe Main:

   static void mostrarFicha(Pessoa p) {
       p.apresentar();
   }

   Chame ele três vezes, passando a aluna, a professora e a estagiária.

   O método não sabe quem vai receber, e funciona pros três.

6. (interface)

   Crie a interface MeioDePagamento com pagar(double valor).
   Crie Pix e Boleto implementando ela, cada uma imprimindo uma
   mensagem diferente com printf e %.2f.

   Declare UMA variável do tipo da interface:

   MeioDePagamento forma;
   forma = new Pix();     forma.pagar(150.00);
   forma = new Boleto();  forma.pagar(150.00);


7. (a armadilha)

   Na Professora, troque o apresentar() sobrescrito por este,
   com um parâmetro a mais e SEM o @Override:

   void apresentar(String cargo) {
       System.out.println("Oi, sou " + nome + ", " + cargo);
   }

   Rode o exercício 3 de novo. O que a professora imprime agora?
   Deu algum erro?

   Depois coloque o @Override nesse método e veja o que o Java diz.

   Essa questão mostra por que o @Override existe.*/
}
