package org.pokekiora;

import org.pokekiora.console.MenuConsole;
import org.pokekiora.decorator.Avocado;
import org.pokekiora.decorator.CreamCheese;
import org.pokekiora.decorator.SalmaoExtra;
import org.pokekiora.decorator.Tare;
import org.pokekiora.financeiro.Caixa;
import org.pokekiora.model.*;
import org.pokekiora.model.Pedido;
import org.pokekiora.model.Poke;
import org.pokekiora.model.PokeBase;
import org.pokekiora.service.PedidoService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MenuConsole console = new MenuConsole();
        PedidoService service = new PedidoService();
        Caixa caixa = Caixa.getInstancia();

        int opcao;

        do {

            console.exibirMensagem("\n========== KIÔRA ==========");
            console.exibirMensagem("1 - Criar pedido");
            console.exibirMensagem("2 - Concluir pedido");
            console.exibirMensagem("3 - Cancelar pedido");
            console.exibirMensagem("4 - Registrar gorjeta");
            console.exibirMensagem("5 - Fechamento do caixa");
            console.exibirMensagem("6 - Listar pedidos");
            console.exibirMensagem("0 - Sair");

            opcao = console.lerInteiro("Escolha uma opção: ");

            switch (opcao) {

                case 1 -> criarPedido(console, service);

                case 2 -> concluirPedido(console, service, caixa);

                case 3 -> cancelarPedido(console, service);

                case 4 -> registrarGorjeta(console, caixa);

                case 5 -> caixa.exibirFechamento();

                case 6 -> listarPedidos(console, service);

                case 0 -> console.exibirMensagem(
                        "Obrigado por escolher o KIÔRA!"
                );

                default -> console.exibirMensagem(
                        "Opção inválida."
                );
            }

        } while (opcao != 0);

        console.fechar();
    }

    private static void criarPedido(
            MenuConsole console,
            PedidoService service) {

        console.exibirMensagem("\n===== CARDÁPIO KIÔRA =====");
        console.exibirMensagem("1 - Kiôra Salmon - R$ 32,90");
        console.exibirMensagem("2 - Kiôra Tuna - R$ 36,90");
        console.exibirMensagem("3 - Kiôra Veggie - R$ 27,90");

        int escolha = console.lerInteiro("Escolha seu poke: ");

        String nome;
        BigDecimal preco;
        List<String> ingredientes = new ArrayList<>();

        switch (escolha) {

            case 1 -> {
                nome = "Kiôra Salmon";
                preco = new BigDecimal("32.90");

                ingredientes.addAll(List.of(
                        "Arroz japonês",
                        "Salmão",
                        "Manga",
                        "Pepino",
                        "Cebolinha",
                        "Gergelim"
                ));
            }

            case 2 -> {
                nome = "Kiôra Tuna";
                preco = new BigDecimal("36.90");

                ingredientes.addAll(List.of(
                        "Arroz japonês",
                        "Atum",
                        "Avocado",
                        "Edamame",
                        "Cebolinha",
                        "Gergelim"
                ));
            }

            case 3 -> {
                nome = "Kiôra Veggie";
                preco = new BigDecimal("27.90");

                ingredientes.addAll(List.of(
                        "Arroz japonês",
                        "Avocado",
                        "Manga",
                        "Pepino",
                        "Cenoura",
                        "Cebolinha"
                ));
            }

            default -> {
                console.exibirMensagem("Opção inválida.");
                return;
            }
        }

        console.exibirMensagem("\nIngredientes selecionados:");
        console.exibirMensagem(String.join(", ", ingredientes));

        String remover;

        do {

            console.exibirMensagem(
                    "\nDigite o ingrediente que deseja retirar."
            );

            console.exibirMensagem(
                    "Digite FIM quando terminar."
            );

            remover = console.lerTexto("Retirar: ").trim();

            if (!remover.equalsIgnoreCase("fim")) {

                String ingredienteRemover = remover;

                boolean encontrado = ingredientes.removeIf(
                        ingrediente -> ingrediente.equalsIgnoreCase(ingredienteRemover)
                );

                if (encontrado) {
                    console.exibirMensagem(
                            remover + " removido do poke."
                    );
                } else {
                    console.exibirMensagem(
                            "Ingrediente não encontrado."
                    );
                }
            }

        } while (!remover.equalsIgnoreCase("fim"));

        Poke poke = new PokeBase(nome, preco, ingredientes);

        int adicional;

        do {

            console.exibirMensagem("\n===== ADICIONAIS =====");
            console.exibirMensagem("1 - Molho Tarê (+ R$ 2,00)");
            console.exibirMensagem("2 - Cream Cheese (+ R$ 3,00)");
            console.exibirMensagem("3 - Avocado (+ R$ 4,00)");
            console.exibirMensagem("4 - Salmão Extra (+ R$ 8,00)");
            console.exibirMensagem("0 - Finalizar adicionais");

            adicional = console.lerInteiro("Escolha: ");

            switch (adicional) {

                case 1 -> poke = new Tare(poke);

                case 2 -> poke = new CreamCheese(poke);

                case 3 -> poke = new Avocado(poke);

                case 4 -> poke = new SalmaoExtra(poke);

                case 0 -> console.exibirMensagem(
                        "Adicionais finalizados."
                );

                default -> console.exibirMensagem(
                        "Opção inválida."
                );
            }

        } while (adicional != 0);

        int numero = console.lerInteiro(
                "\nNúmero da comanda: "
        );

        Pedido pedido = new Pedido(numero, poke);

        try {

            service.registrarPedido(pedido);

            console.exibirMensagem("\n===== COMANDA KIÔRA =====");
            console.exibirMensagem("Comanda: " + numero);
            console.exibirMensagem("Poke: " + poke.getDescricao());
            console.exibirMensagem(
                    "Ingredientes: " + String.join(
                            ", ", poke.getIngredientes()
                    )
            );

            console.exibirMensagem(
                    "TOTAL: R$ " + poke.getPreco()
            );

            console.exibirMensagem("Status: ABERTO");
            console.exibirMensagem("=========================");

        } catch (IllegalArgumentException e) {

            console.exibirMensagem(e.getMessage());
        }
    }

    private static void concluirPedido(
            MenuConsole console,
            PedidoService service,
            Caixa caixa) {

        int numero = console.lerInteiro(
                "Número da comanda: "
        );

        Pedido pedido = service.buscarPedido(numero);

        if (pedido == null) {
            console.exibirMensagem("Comanda não encontrada.");
            return;
        }

        if (service.concluirPedido(numero)) {

            boolean registrado = caixa.registrarTransacao(
                    numero,
                    pedido.getValor()
            );

            if (registrado) {
                console.exibirMensagem(
                        "Pedido concluído e venda registrada!"
                );
            } else {
                console.exibirMensagem(
                        "Não foi possível registrar a venda no caixa."
                );
            }

        } else {

            console.exibirMensagem(
                    "Pedido já concluído ou cancelado."
            );
        }
    }

    private static void cancelarPedido(
            MenuConsole console,
            PedidoService service) {

        int numero = console.lerInteiro(
                "Número da comanda: "
        );

        if (service.cancelarPedido(numero)) {

            console.exibirMensagem("Pedido cancelado!");

        } else {

            console.exibirMensagem(
                    "Não foi possível cancelar esse pedido."
            );
        }
    }

    private static void registrarGorjeta(
            MenuConsole console,
            Caixa caixa) {

        double valor = console.lerDecimal(
                "Valor da gorjeta: R$ "
        );

        if (valor <= 0) {
            console.exibirMensagem(
                    "A gorjeta precisa ser maior que zero."
            );
            return;
        }

        caixa.registrarGorjeta(BigDecimal.valueOf(valor));

        console.exibirMensagem("Gorjeta registrada!");
    }

    private static void listarPedidos(
            MenuConsole console,
            PedidoService service) {

        console.exibirMensagem("\n===== PEDIDOS KIÔRA =====");

        if (service.listarPedidos().isEmpty()) {
            console.exibirMensagem("Nenhum pedido cadastrado.");
            return;
        }

        for (Pedido pedido : service.listarPedidos()) {

            console.exibirMensagem(
                    "\nComanda: " + pedido.getNumero()
            );

            console.exibirMensagem(
                    "Poke: " + pedido.getPoke().getDescricao()
            );

            console.exibirMensagem(
                    "Valor: R$ " + pedido.getValor()
            );

            console.exibirMensagem(
                    "Status: " + pedido.getStatus()
            );
        }
    }
}