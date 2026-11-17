package Polimorfismo;

public class Atividade1 {
    /*
    (mesma classe — muda a QUANTIDADE de parâmetros)
    Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
    - recebe um double (lado do quadrado) -> lado * lado
    - recebe dois double (base e altura) -> base * altura
    - recebe um int (raio do círculo) -> 3.14159 * raio * raio
    Chame os três na Main e imprima os resultados.
    */

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double areaQuadrado = calc.calcularArea(5.0);
        double areaRetangulo = calc.calcularArea(4.0, 6.0);
        double areaCirculo = calc.calcularArea(3);

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}

/*
Explicação Passo a Passo:
1. Sobrecarga de métodos (Overload): Podemos criar vários métodos com o mesmo
   nome (calcularArea) na mesma classe, desde que a lista de parâmetros seja
   diferente (seja na quantidade ou no tipo).
2. Escolha automática do Java: Quando chamamos calc.calcularArea(5.0), o Java
   vê 1 double e usa a fórmula do quadrado. Com (4.0, 6.0), vê 2 doubles e usa
   a do retângulo. Com (3) sem ponto decimal, vê 1 int e usa a do círculo.
*/