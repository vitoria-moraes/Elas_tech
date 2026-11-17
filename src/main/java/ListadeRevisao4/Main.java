package ListadeRevisao4;

/*
QUESTÃO 6 - ETAPA 6 e PERGUNTA FINAL:
No main, crie um desenvolvedor e um gerente, pague os dois usando uma folha com notificação por email,
e depois crie outra folha com notificação por SMS.
Pergunta final: quais princípios e conceitos de POO você usou em cada etapa?
*/

public class Main {
    public static void main(String[] args) {
        Funcionario dev = new Desenvolvedor("Vitória", 4000.0);
        Funcionario gerente = new Gerente("Samira", 8000.0);

        FolhaPagamento folhaEmail = new FolhaPagamento(new NotificadorEmail());
        folhaEmail.pagar(dev);
        folhaEmail.pagar(gerente);

        System.out.println("---");

        FolhaPagamento folhaSms = new FolhaPagamento(new NotificadorSms());
        folhaSms.pagar(dev);
        folhaSms.pagar(gerente);
    }
}

/*
PERGUNTA FINAL (CONCEITOS E PRINCÍPIOS POR ETAPA):
- Etapa 1: Encapsulamento (atributos private, getters e validação no setter) e Abstração (classe base).
- Etapa 2: Abstração (contrato obrigatório via metodo abstrato calcularSalario).
- Etapa 3: Herança (extends Funcionario) e Polimorfismo (@Override com cálculos diferentes).
- Etapa 4: Abstração (interface Notificador) e OCP - Aberto/Fechado (permite criar novos notificadores sem alterar os atuais).
- Etapa 5: DIP - Inversão de Dependência / Injeção de Dependência (depende das abstrações Notificador e Funcionario) e SRP (responsabilidade única).
- Etapa 6: Polimorfismo em tempo de execução (tratando Desenvolvedor e Gerente como Funcionario e trocando o Notificador dinamicamente).
*/