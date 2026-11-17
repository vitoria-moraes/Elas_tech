package Polimorfismo;

public class Atividade6 {
    /*
    (interface)
    Crie a interface MeioDePagamento com pagar(double valor).
    Crie Pix e Boleto implementando ela, cada uma imprimindo uma
    mensagem diferente com printf e %.2f.
    Declare UMA variável do tipo da interface:
    MeioDePagamento forma;
    forma = new Pix(); forma.pagar(150.00);
    forma = new Boleto(); forma.pagar(150.00);
    */

    public static void main(String[] args) {
        MeioDePagamento forma;

        forma = new Pix();
        forma.pagar(150.00);

        forma = new Boleto();
        forma.pagar(150.00);
    }
}

/*
Explicação Passo a Passo:
1. Variável polimórfica de interface (MeioDePagamento forma): Uma única variável
   do tipo da interface pode apontar para qualquer objeto que implemente aquele
   contrato, mudando de comportamento em tempo de execução.
2. Troca dinâmica de implementação: Na primeira chamada, 'forma' guarda um
   objeto Pix, então executa o pagar() do Pix. Logo abaixo, a mesma variável
   passa a guardar um objeto Boleto, executando o pagar() do Boleto.
*/