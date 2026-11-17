package ListadeRevisao4;

/*
QUESTÃO 6 - ETAPA 3 (Parte 1):
Crie uma classe que herda de Funcionario:
Desenvolvedor: o salário é o salário base mais 20%. (salario = salarioBase * 1.20)
*/

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.20;
    }
}

/*
PASSO A PASSO:
1. Usa extends Funcionario para herdar nome e salarioBase.
2. Chama super(nome, salarioBase) no construtor para inicializar a classe mãe.
3. Sobrescreve calcularSalario() aplicando o bônus de 20%.
*/
