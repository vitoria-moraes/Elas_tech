package Decorator;

/*
Questão 3 (prática).
No main:
Crie um açaí só com granola e imprima a descrição e o preço.
Crie um açaí com granola e morango (um adicional embrulhando o outro) e imprima a descrição e o preço.
*/

public class MainDecorator {
    public static void main(String[] args) {
        Acai acaiComGranola = new GranolaDecorator(new AcaiSimples());
        System.out.println(acaiComGranola.getDescricao() + " -> R$ " + acaiComGranola.getPreco());

        Acai acaiCompleto = new MorangoDecorator(new GranolaDecorator(new AcaiSimples()));
        System.out.println(acaiCompleto.getDescricao() + " -> R$ " + acaiCompleto.getPreco());
    }
}

/*
PASSO A PASSO:
1. Primeiro cria um AcaiSimples embrulhado por GranolaDecorator (R$ 14,50).
2. Depois embrulha o açaí com granola dentro de MorangoDecorator, somando tudo em cadeia (R$ 18,50).
*/
