package FactoryAdpaterFacade;

/*
Questão 6 (prática).
Você recebeu esta classe de outra empresa. Ela não pode ser alterada:
public class PayPalAPI {
    public void sendPayment() {
        System.out.println("Pagamento enviado pelo PayPal.");
    }
}
*/

public class PayPalAPI {
    public void sendPayment() {
        System.out.println("Pagamento enviado pelo PayPal.");
    }
}

/*
PASSO A PASSO:
1. Classe externa incompatível com a interface Pagamento (possui sendPayment() em vez de pagar()).
*/