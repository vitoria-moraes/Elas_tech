package FactoryAdpaterFacade;

/*
Questão 9 (prática).
Crie a classe ManhaFacade com um metodo acordar() que desligue o despertador, faça o café e ligue o chuveiro, nessa ordem.
*/

public class ManhaFacade {
    private Despertador despertador;
    private Cafeteira cafeteira;
    private Chuveiro chuveiro;

    public ManhaFacade() {
        this.despertador = new Despertador();
        this.cafeteira = new Cafeteira();
        this.chuveiro = new Chuveiro();
    }

    public void acordar() {
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}

/*
PASSO A PASSO:p
1. Guarda os três subsistemas como atributos privados e os inicializa no construtor.
2. O metodo acordar() orquestra todas as etapas na ordem solicitada em uma única chamada.
*/
