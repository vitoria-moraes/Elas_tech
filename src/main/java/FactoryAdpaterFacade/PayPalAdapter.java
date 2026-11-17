package FactoryAdpaterFacade;

/*
Questão 6 (prática).
Crie a classe PayPalAdapter, para que o sistema consiga usar o PayPal como um Pagamento.
Não precisa fazer nenhuma conversão: o método pagar() só precisa chamar o método da classe de fora.
*/

public class PayPalAdapter implements Pagamento {
    private PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void pagar() {
        payPalAPI.sendPayment();
    }
}

/*
PASSO A PASSO:
1. Implementa Pagamento e guarda uma referência de PayPalAPI por composição.
2. Dentro de pagar(), delega a execução para payPalAPI.sendPayment().
*/