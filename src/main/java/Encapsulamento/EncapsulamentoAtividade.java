package Encapsulamento;

public class EncapsulamentoAtividade {
    public static void main(String[] args) {

        // QUESTÃO 1: Sentir o private na pele
        System.out.println("--- QUESTÃO 1: Private ---");
        ContaBancaria c1 = new ContaBancaria();

        // COMENTÁRIO: As linhas abaixo dão erro de compilação porque 'titular' e 'saldo'
        // são privados e não podem ser acessados ou alterados diretamente de fora da classe.
        // System.out.println(c1.titular); // Erro: has private access
        // c1.saldo = -5000;             // Erro: has private access
        System.out.println("Atributos privados impedem acesso direto indesejado.\n");


        // ==========================================
        // QUESTÃO 2: A porta de leitura (Getters)
        // ==========================================
        System.out.println("--- QUESTÃO 2: Getters (Leitura) ---");
        ContaBancaria c2 = new ContaBancaria();

        // COMENTÁRIO: Usamos os getters para conseguir ler os valores de forma segura.
        // O objeto foi criado agora, então os valores vêm com os padrões do Java (null e 0.0).
        System.out.println("Titular: " + c2.getTitular()); // Imprime: null
        System.out.println("Saldo: " + c2.getSaldo());     // Imprime: 0.0
        System.out.println();


        // ==========================================
        // QUESTÃO 3: A porta de escrita com porteiro (Setter com validação)
        // ==========================================
        System.out.println("--- QUESTÃO 3: Setter com Validação ---");
        ContaBancaria c3 = new ContaBancaria();

        // COMENTÁRIO: Tentando colocar um valor vazio (""). O setter rejeita e avisa.
        c3.setTitular("");
        System.out.println("Titular: " + c3.getTitular());

        // COMENTÁRIO: Colocando um valor válido ("Ana"). O setter aceita e atualiza.
        c3.setTitular("Ana");
        System.out.println("Titular: " + c3.getTitular());
        System.out.println();


        // ==========================================
        // QUESTÃO 4: Métodos que fazem o trabalho sujo
        // ==========================================
        System.out.println("--- QUESTÃO 4: Operações e Métodos Privados ---");
        ContaBancaria c4 = new ContaBancaria();
        c4.setTitular("Ana"); // Definindo titular para aparecer nos logs

        c4.depositar(500);  // Depósito válido
        System.out.println("Saldo: " + c4.getSaldo());

        c4.depositar(-100); // Depósito inválido (recusado)
        c4.sacar(2000);     // Saque recusado (saldo insuficiente)

        c4.sacar(200);      // Saque válido
        System.out.println("Saldo: " + c4.getSaldo());

        // COMENTÁRIO: Tentar chamar c4.registrarLog("teste") aqui geraria erro,
        // pois registrarLog() é private e serve apenas para o maquinário interno da classe.
        System.out.println();


        // ==========================================
        // QUESTÃO 5: Os modificadores lado a lado
        // ==========================================
        System.out.println("--- QUESTÃO 5: Modificadores (private, default, public) ---");
        Produto p = new Produto();

        // COMENTÁRIO: 'nome' é default (visível no mesmo pacote) e 'preco' é public. Ambos imprimem.
        System.out.println(p.nome);  // Imprime: Caneta
        System.out.println(p.preco); // Imprime: 5.5

        // COMENTÁRIO: A linha abaixo daria erro porque codigoInterno é private:
        // System.out.println(p.codigoInterno);
        System.out.println();


        // ==========================================
        // QUESTÃO 6: Nem todo atributo precisa de setter
        // ==========================================
        System.out.println("--- QUESTÃO 6: Imutabilidade Parcial (Apenas Getter) ---");
        ContaBancaria c6 = new ContaBancaria();

        // COMENTÁRIO: O número da conta pode ser lido...
        System.out.println("Numero da conta: " + c6.getNumeroConta());

        // COMENTÁRIO: ...mas não pode ser alterado, pois criamos o getter mas NÃO criamos o setter.
        // c6.setNumeroConta("999-Z"); // Erro: cannot find symbol method setNumeroConta
    }
}


// =====================================================================
// CLASSE 1: ContaBancaria (Usada nas questões 1, 2, 3, 4 e 6)
// =====================================================================
class ContaBancaria {
    // ATRIBUTOS PRIVADOS (Segurança e encapsulamento)
    private String titular;
    private double saldo;
    private String numeroConta = "001-X"; // Atributo fixo (Questão 6)

    // GETTERS (Portas de leitura)
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta; // Apenas leitura, sem setter correspondente
    }

    // SETTER COM VALIDAÇÃO (Porta de escrita com regras)
    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return; // Sai do método imediatamente sem alterar nada
        }
        this.atributoSeguro(titular); // Exemplo de uso interno opcional ou atribuição direta:
        this.titular = titular;
    }

    // Método auxiliar interno para o setter (apenas exemplo de organização)
    private void atributoSeguro(String t) {
        // Maquinário interno privado opcional
    }

    // MÉTODOS PÚBLICOS (Operações que o usuário da classe pode fazer)
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        saldo += valor;
        registrarLog("deposito de " + valor); // Chama método privado de log
    }

    public void sacar(double valor) {
        if (!temSaldo(valor)) { // Usa método privado para validar regra
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        registrarLog("saque de " + valor); // Chama método privado de log
    }

    // MÉTODOS PRIVADOS (Maquinário interno — o mundo externo não vê)
    private boolean temSaldo(double valor) {
        return saldo >= valor;
    }

    private void registrarLog(String acao) {
        System.out.println("[LOG] " + titular + ": " + acao);
    }
}


// =====================================================================
// CLASSE 2: Produto (Usada na questão 5)
// =====================================================================
class Produto {
    private String codigoInterno = "X-99"; // Restrito apenas à classe Produto
    String nome = "Caneta";                // Modificador Default (visível apenas dentro do mesmo package)
    public double preco = 5.50;            // Modificador Public (visível por qualquer um)
}