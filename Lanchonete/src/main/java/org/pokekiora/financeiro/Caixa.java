package org.pokekiora.financeiro;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Caixa {

    private static Caixa instancia;

    private final Set<Transacao> transacoes;
    private final Map<LocalDate, List<BigDecimal>> gorjetas;

    private Caixa() {
        transacoes = new HashSet<>();
        gorjetas = new HashMap<>();
    }

    public static Caixa getInstancia() {

        if (instancia == null) {
            instancia = new Caixa();
        }

        return instancia;
    }

    public boolean registrarTransacao(
            int numeroPedido,
            BigDecimal valor) {

        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }

        Transacao transacao = new Transacao(numeroPedido, valor);

        return transacoes.add(transacao);
    }

    public void registrarGorjeta(BigDecimal valor) {

        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }

        gorjetas.computeIfAbsent(
                LocalDate.now(),
                data -> new ArrayList<>()
        ).add(valor);
    }

    public BigDecimal calcularTotalVendas() {

        LocalDate hoje = LocalDate.now();

        return transacoes.stream()
                .filter(t -> t.getData().equals(hoje))
                .map(Transacao::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calcularTotalGorjetas() {

        List<BigDecimal> valores = gorjetas.getOrDefault(
                LocalDate.now(),
                new ArrayList<>()
        );

        return valores.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calcularFechamento() {

        return calcularTotalVendas()
                .add(calcularTotalGorjetas());
    }

    public void exibirFechamento() {

        System.out.println("\n========== KIÔRA ==========");
        System.out.println("FECHAMENTO DO CAIXA");
        System.out.println("Data: " + LocalDate.now());

        System.out.println("---------------------------");

        System.out.println(
                "Total de vendas: R$ " + calcularTotalVendas()
        );

        System.out.println(
                "Total de gorjetas: R$ " + calcularTotalGorjetas()
        );

        System.out.println("---------------------------");

        System.out.println(
                "TOTAL DO CAIXA: R$ " + calcularFechamento()
        );

        System.out.println("===========================");
    }

    public void limparCaixa() {
        transacoes.clear();
        gorjetas.clear();
    }
}