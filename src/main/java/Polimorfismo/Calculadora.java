package Polimorfismo;

public class Calculadora {
    // Área do quadrado (1 double)
    public double calcularArea(double lado) {
        return lado * lado;
    }

    // Área do retângulo (2 doubles)
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Área do círculo (1 int)
    public double calcularArea(int raio) {
        return 3.14159 * raio * raio;
    }
}
