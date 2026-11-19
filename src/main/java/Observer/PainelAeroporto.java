package Observer;

/*
5 - Crie uma classe PainelAeroporto que também implementa ObservadorVoo e imprime "Painel: " + o status.
*/

public class PainelAeroporto implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " + status);
    }
}

/*
PASSO A PASSO:
1. Novo observador adicionado sem precisar modificar uma única linha da classe Voo.
*/