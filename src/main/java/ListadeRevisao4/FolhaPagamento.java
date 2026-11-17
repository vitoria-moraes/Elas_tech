package ListadeRevisao4;
/*
QUESTÃO 6 - ETAPA 5:
Crie uma classe FolhaPagamento que recebe um Notificador pelo construtor e tem um método pagar(Funcionario f),
que calcula o salário e usa o notificador para avisar o funcionário.
*/

public class FolhaPagamento {
    private Notificador notificador;

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;
    }

    public void pagar(Funcionario f) {
        double salarioFinal = f.calcularSalario();
        notificador.notificar("Pagamento de R$ " + salarioFinal + " realizado para " + f.getNome());
    }
}

/*
PASSO A PASSO:
1. Recebe Notificador no construtor (Injeção de Dependência), sem ficar presa a Email ou SMS.
2. No método pagar(), recebe qualquer Funcionario (Polimorfismo), calcula o salário e dispara a notificação.
*/
