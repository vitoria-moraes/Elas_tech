package ForEach;

public class Atividade1 {
    public static void main(String[] args) {
        /*Enunciado: Crie um array (não ArrayList,
        array normal) com 4 nomes e imprima todos
        usando for-each, um por linha.*/
        // 1. Criando um array normal de Strings com 4 nomes
        String[] nomes = {"Vitória", "Ana", "Carlos", "Beatriz"};

        // 2. Percorrendo o array com for-each e imprimindo um nome por linha
        for (String nome : nomes) {
            System.out.println(nome);

        }
        /*String[] nomes = {...}: Diferente do ArrayList,
        o array tradicional em Java usa colchetes [] e é
        inicializado diretamente com chaves {} contendo os 4 elementos.
        for (String nome : nomes): Lemos essa estrutura como
        "para cada nome dentro de nomes". A cada repetição do laço,
        o Java pega o próximo item do array e guarda automaticamente
        na variável nome, sem precisarmos nos preocupar com índices (i = 0, i++).*/
    }
}
