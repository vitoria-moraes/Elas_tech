package TestesUnitarios;

/*
Atividade Prática: Meu Primeiro TDD com JUnit 5
Mão na massa: A Calculadora de Descontos

Regras de Negócio que nossa classe deve ter:
Metodo aplicarDesconto(double valorCompra, boolean clienteVip):
- Se a compra for menor que R$ 100,00 e o cliente não for VIP, não tem desconto (retorna o próprio valorCompra).
- Se o cliente for VIP, ganha 10% de desconto em qualquer valor (multiplica por 0.90).
- Se o valorCompra passado for zero ou negativo (<= 0), deve lançar um erro: IllegalArgumentException.
*/

public class CalculadoraDesconto {

    public double aplicarDesconto(double valorCompra, boolean clienteVip) {
        if (valorCompra <= 0) {
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero.");
        }
        if (clienteVip) {
            return valorCompra * 0.90;
        }
        return valorCompra;
    }
}

/*
PASSO A PASSO:
1. Valida primeiro a exceção: se valorCompra <= 0, lança IllegalArgumentException.
2. Verifica se clienteVip é true para aplicar os 10% de desconto (valorCompra * 0.90).
3. Caso contrário (compra < 100 e cliente comum), retorna o valorCompra original sem desconto.
*/