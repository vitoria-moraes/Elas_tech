package ListaDeRevisao3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ListaRevisao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Estruturas de dados
        Pet[] lista = new Pet[5];
        int total = 0;
        int opcao = -1;

        // Fila de banho
        ArrayDeque<String> filaBanho = new ArrayDeque<>();

        while (opcao != 0) {
            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pet pelo nome");
            System.out.println("4 - Ver espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo da fila");
            System.out.println("7 - Executar serviços (Banho, Tosa, Consulta)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            // Tratamento de erro do menu
            try {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer do teclado

                switch (opcao) {
                    case 1:
                        if (total >= lista.length) {
                            System.out.println("Cadastro cheio! Não cabem mais pets.");
                            break;
                        }

                        System.out.print("Nome do pet: ");
                        String nome = sc.nextLine();

                        System.out.print("Espécie: ");
                        String especie = sc.nextLine();

                        System.out.print("Peso (kg): ");
                        double peso = sc.nextDouble();
                        sc.nextLine(); // Limpa o buffer

                        // Instanciação polimórfica
                        Pet novoPet;
                        if (especie.equalsIgnoreCase("Cachorro")) {
                            novoPet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            novoPet = new Gato();
                        } else {
                            novoPet = new Pet();
                        }

                        novoPet.nome = nome;
                        novoPet.especie = especie;
                        novoPet.peso = peso;
                        novoPet.porte = novoPet.definirPorte(); // Calcula o porte automaticamente

                        lista[total] = novoPet;
                        total++;

                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("\n--- PETS CADASTRADOS ---");
                            for (int i = 0; i < total; i++) {
                                // Exemplo de sobrecarga : chamando a ficha completa
                                mostrarFichaPet(lista[i], "=== FICHA DO PET ===");
                                lista[i].emitirSom(); // Polimorfismo (Questão 15)
                                System.out.println();
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Qual pet você procura? ");
                        String busca = sc.nextLine();
                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.println("Encontrado: " + lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg");
                                achou = true;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:
                        // HashSet para espécies sem repetição
                        HashSet<String> especiesUnicas = new HashSet<>();
                        for (int i = 0; i < total; i++) {
                            especiesUnicas.add(lista[i].especie);
                        }

                        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");
                        for (String esp : especiesUnicas) {
                            System.out.println("- " + esp);
                        }
                        System.out.println("Total de espécies diferentes: " + especiesUnicas.size());
                        break;

                    case 5:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String petFila = sc.nextLine();
                        filaBanho.add(petFila);
                        System.out.println(petFila + " entrou na fila.");
                        System.out.println("Fila agora: " + filaBanho);
                        break;

                    case 6:
                        if (filaBanho.isEmpty()) {
                            System.out.println("A fila de banho está vazia.");
                        } else {
                            String proximo = filaBanho.peek();
                            System.out.println("Próximo da fila: " + proximo);
                            System.out.println("Atendendo " + proximo + "...");
                            filaBanho.poll(); // Remove o primeiro da fila
                            System.out.println("Fila agora: " + filaBanho);
                        }
                        break;

                    case 7:
                        System.out.print("Nome do pet para os serviços: ");
                        String nomeServico = sc.nextLine();

                        // Lista de serviços usando Interface (Questão 13)
                        ArrayList<Servico> servicos = new ArrayList<>();
                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico serv : servicos) {
                            serv.executar(nomeServico);
                        }
                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine(); // Limpa o buffer para evitar loop infinito
            }
        }
        sc.close();
    }


    static void mostrarFichaPet(Pet p) {
        System.out.println("Nome: " + p.nome);
        System.out.println("---");
    }

    static void mostrarFichaPet(Pet p, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + p.nome);
        System.out.println("Espécie: " + p.especie);
        System.out.println("Peso: " + p.peso + " kg");
        System.out.println("Porte: " + p.porte);
    }
}


// CLASSE MÃE: Pet

class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    // Método para definir o porte com base no peso
    String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    // Método genérico de som
    void emitirSom() {
        System.out.println(nome + " faz algum som.");
    }
}



// CLASSES FILHAS: Cachorro e Gato

class Cachorro extends Pet {
    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }
}

class Gato extends Pet {
    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }
}



// INTERFACE E CLASSES DE SERVIÇO

interface Servico {
    void executar(String nomePet);
}

class Banho implements Servico {
    @Override
    public void executar(String nomePet) {
        System.out.println("Dando banho em " + nomePet + "...");
    }
}

class Tosa implements Servico {
    @Override
    public void executar(String nomePet) {
        System.out.println("Tosando " + nomePet + "...");
    }
}

class Consulta implements Servico {
    @Override
    public void executar(String nomePet) {
        System.out.println("Levando " + nomePet + " para a consulta...");
    }
}