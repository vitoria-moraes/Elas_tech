package Heranca;

/*
Crie duas interfaces:
- Notificavel, com notificar(String mensagem)
- Exportavel, com exportar()

Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
extends Funcionario:
class Gerente extends Funcionario implements Notificavel, Exportavel

Na Main, crie um gerente, preencha o nome e chame os quatro
métodos nele: baterPonto(), aprovarFerias(), notificar()
e exportar().

UMA herança (extends), VÁRIAS interfaces (implements).

Depois tente colocar uma segunda classe no extends:
extends Funcionario, Pessoa
Veja o que o Java responde.
*/

public class Atividade6 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.nome = "Roberto";

        gerente.baterPonto();
        gerente.aprovarFerias("Vitória");
        gerente.notificar("Reunião de alinhamento às 14h.");
        gerente.exportar();
    }
}

/*
Explicação Passo a Passo:
1. extends + implements juntos: A ordem obrigatória na assinatura da classe é
   sempre 'extends' primeiro e 'implements' depois. Assim, Gerente herda o
   código de Funcionario e assina os contratos de Notificavel e Exportavel.
2. O que acontece ao tentar "extends Funcionario, Pessoa": O Java dá um erro de
   compilação imediatamente (Syntax error / Class cannot extend multiple classes),
   porque o Java NÃO permite herança múltipla de classes (para evitar conflito
   caso duas classes mães tenham métodos iguais). Já interfaces não têm esse
   problema, por isso podemos implementar quantas quisermos separadas por vírgula.
*/
