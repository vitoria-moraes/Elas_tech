package Observer;

/*
4 - a) Crie uma classe Passageiro que implementa ObservadorVoo e, no atualizar, imprime "Passageiro avisado: " + o status.
*/

public class Passageiro implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro avisado: " + status);
    }
}

/*
PASSO A PASSO:
1. Implementa ObservadorVoo e define a reação específica do passageiro ao receber o novo status.
*/