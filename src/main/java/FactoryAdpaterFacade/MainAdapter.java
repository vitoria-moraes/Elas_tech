package FactoryAdpaterFacade;

/*
Questão 6 (prática).
No main:
1. Escreva, como comentário, a linha que tentaria usar PayPalAPI direto como Pagamento (a que não compila).
2. Crie uma variável do tipo Pagamento usando o adapter e chame pagar().
*/

public class MainAdapter {
    public static void main(String[] args) {
        // Pagamento pErro = new PayPalAPI();

        Pagamento pagamento = new PayPalAdapter(new PayPalAPI());
        pagamento.pagar();
    }
}

/*
PASSO A PASSO:
1. A linha comentada não compila porque PayPalAPI não implementa Pagamento.
2. Envolvendo PayPalAPI dentro de PayPalAdapter, o sistema consegue utilizá-lo normalmente como Pagamento.
*/