package Observer;

/*
6 - c) Crie uma classe Estoque com uma lista de observadores, um método adicionarObservador e um método setQuantidade(int quantidade), que avisa todos da lista.
*/

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<ObservadorEstoque> observadores = new ArrayList<>();
    private int quantidade;

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        for (ObservadorEstoque observador : observadores) {
            observador.atualizar(this.quantidade);
        }
    }
}

/*
PASSO A PASSO:
1. Atua como o Subject: guarda a quantidade atual e a lista de observadores.
2. Sempre que setQuantidade() é executado, dispara atualizar() para todos os observadores registrados.
*/