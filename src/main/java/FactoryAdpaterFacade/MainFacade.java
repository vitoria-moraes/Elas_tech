package FactoryAdpaterFacade;

/*
Questão 9 (prática).
No main, use só a fachada: crie um objeto ManhaFacade e chame acordar().
*/

public class MainFacade {
    public static void main(String[] args) {
        ManhaFacade manha = new ManhaFacade();
        manha.acordar();
    }
}

/*
PASSO A PASSO:
1. O main não precisa conhecer Despertador, Cafeteira nem Chuveiro; interage apenas com ManhaFacade.
*/