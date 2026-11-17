package ListadeRevisao4;

/*
QUESTÃO 6 - ETAPA 3 (Parte 2):
Crie uma classe que herda de Funcionario:
Gerente: o salário é o salário base mais 50%. (salario = salarioBase * 1.50)
*/

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.50;
    }
}

/*
PASSO A PASSO:
1. Herda de Funcionario e repassa os parâmetros via super().
2. Sobrescreve calcularSalario() aplicando o bônus de 50%.
*/