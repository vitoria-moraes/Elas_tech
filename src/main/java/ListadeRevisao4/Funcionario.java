package ListadeRevisao4;

/*
QUESTÃO 6 - ETAPA 1 e 2:
Crie uma classe abstrata Funcionario com atributos privados nome e salarioBase,
um construtor que recebe os dois, getters, e um setter de salarioBase que não aceite valores negativos.
Adicione à classe Funcionario um método abstrato calcularSalario().
*/

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("Salário base não pode ser negativo.");
            return;
        }
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}

/*
PASSO A PASSO:
1. Classe abstrata serve como modelo base (não pode ser instanciada diretamente).
2. Atributos private garantem encapsulamento e o setter bloqueia valores negativos.
3. O método abstrato obriga toda subclasse a implementar sua própria regra de salário.
*/