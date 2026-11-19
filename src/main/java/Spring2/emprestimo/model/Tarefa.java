package Spring2.emprestimo.model;

import jakarta.persistence.*;

/*
 * Questão 1 — O model
 * Crie a classe Tarefa no pacote model com: id (Long), titulo (String) e feita (boolean), todos privados,
 * construtor vazio e getters/setters (usando isFeita() para o boolean).
 */
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private boolean feita;

    public Tarefa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }
}

/*
 * Passo a passo:
 * Utilizado @Entity para mapear a classe como tabela no banco de dados.
 * Definido @Id e @GeneratedValue(IDENTITY) para gerar a chave primária automaticamente.
 * Criado o construtor vazio exigido pelo JPA e os getters/setters, usando isFeita() conforme padrão para tipos boolean.
 */