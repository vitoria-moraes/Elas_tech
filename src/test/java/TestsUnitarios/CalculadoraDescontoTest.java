package TestsUnitarios;

/*
Sua Missão na classe CalculadoraDescontoTest:
Teste 1 (@Test): Prepare uma compra de R$ 50.0 para cliente comum (false) e use assertEquals para garantir que retorna 50.0.
Teste 2 (@Test): Prepare uma compra de R$ 200.0 para cliente VIP (true) e use assertEquals para garantir que retorna 180.0.
Teste 3 (@Test): Use assertThrows para garantir que passar -10.0 lança IllegalArgumentException!
*/

import TestesUnitarios.CalculadoraDesconto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraDescontoTest {

    @Test
    void deveRetornarValorOriginalParaCompraMenorQue100EClienteComum() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        // Act
        double resultado = calculadora.aplicarDesconto(50.0, false);

        // Assert
        assertEquals(50.0, resultado);
    }

    @Test
    void deveAplicar10PorCentoDeDescontoParaClienteVip() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        // Act
        double resultado = calculadora.aplicarDesconto(200.0, true);

        // Assert
        assertEquals(180.0, resultado);
    }

    @Test
    void deveLancarExcecaoQuandoValorCompraForZeroOuNegativo() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.aplicarDesconto(-10.0, false);
        });
    }
}

/*
PASSO A PASSO:
1. Cada método de teste é anotado com @Test do JUnit 5 (org.junit.jupiter.api.Test).
2. Segue o padrão AAA (Arrange: instancia a calculadora; Act: chama aplicarDesconto; Assert: valida com assertEquals ou assertThrows).
3. No Teste 3, a chamada fica dentro de uma lambda () -> para o assertThrows capturar a exceção sem quebrar a execução do teste.
*/
