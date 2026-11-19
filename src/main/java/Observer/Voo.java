package Observer;

/*
4 - b) Crie uma classe Voo com uma lista de ObservadorVoo, um método adicionarObservador(ObservadorVoo o) e um método mudarStatus(String status), que chama o atualizar de todos da lista.
*/

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private List<ObservadorVoo> observadores = new ArrayList<>();
    private String status;

    public void adicionarObservador(ObservadorVoo o) {
        observadores.add(o);
    }

    public void mudarStatus(String status) {
        this.status = status;
        for (ObservadorVoo o : observadores) {
            o.atualizar(this.status);
        }
    }
}

/*
PASSO A PASSO:
1. Mantém uma List<ObservadorVoo> para armazenar qualquer classe que implemente a interface.
2. Quando mudarStatus() é chamado, atualiza o estado e percorre a lista notificando todos os inscritos via atualizar().
*/