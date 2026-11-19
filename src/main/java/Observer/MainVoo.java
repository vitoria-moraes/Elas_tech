package Observer;

/*
4 - c) No main, crie um voo, adicione um passageiro e mude o status para "Embarque iniciado".
5 - No main, adicione ao voo um passageiro e um painel, e mude o status para "Atrasado". Os dois devem ser avisados.
*/

public class MainVoo {
    public static void main(String[] args) {
        Voo voo = new Voo();
        Passageiro passageiro = new Passageiro();
        PainelAeroporto painel = new PainelAeroporto();

        // Etapa 4c
        voo.adicionarObservador(passageiro);
        voo.mudarStatus("Embarque iniciado");

        System.out.println("---");

        // Etapa 5
        voo.adicionarObservador(painel);
        voo.mudarStatus("Atrasado");
    }
}

/*
PASSO A PASSO:
1. Primeiro adiciona apenas o passageiro e muda o status para "Embarque iniciado" (só o passageiro é avisado).
2. Depois adiciona também o painel e muda para "Atrasado" (ambos são avisados automaticamente).
*/