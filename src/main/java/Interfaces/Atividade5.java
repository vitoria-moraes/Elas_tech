package Interfaces;

import java.util.ArrayList;

public class Atividade5 {
    public static void main(String[] args) {
        /*
        Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
        Crie Carro e Moto implementando os dois. Coloque numa lista e
        percorra com for-each chamando os dois métodos em cada um.
        */
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }
    }
}

/*
Explicação Passo a Passo:
1. Contrato com múltiplos métodos: A interface Veiculo exige que tanto Carro
   quanto Moto implementem obrigatoriamente ambos os métodos (ligar e acelerar).
2. Polimorfismo no for-each: A lista ArrayList<Veiculo> aceita qualquer classe
   que implemente Veiculo. Dentro do laço, cada item executa suas próprias
   versões de ligar() e acelerar() na sequência.
*/