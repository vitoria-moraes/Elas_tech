package ListadeRevisao4;

/*
QUESTÃO 5: CLASSE ABSTRATA
a) Crie uma classe abstrata Forma com: um atributo nome; um construtor que recebe o nome; um metodo
normal exibirNome(), que imprime o nome da forma; um metodo abstrato calcularArea(), que retorna um double.
b) Crie uma classe Retangulo que herda de Forma, tem os atributos largura e altura, e implementa calcularArea().
c) No main, crie um Retangulo, chame exibirNome() e imprima a área.
d) Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê?
*/

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Forma: " + this.nome);
    }

    public abstract double calcularArea();
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo("Retângulo", 5.0, 3.0);
        r.exibirNome();
        System.out.println("Área: " + r.calcularArea());

        // Forma f = new Forma("teste");
    }
}

/*
EXPLICAÇÃO (ITEM D):
- O código "Forma f = new Forma("teste");" gera erro de compilação ('Forma' is abstract; cannot be instantiated).
- Motivo: Classes abstratas servem apenas como modelo base para herança e não podem ser instanciadas diretamente com new.
*/
