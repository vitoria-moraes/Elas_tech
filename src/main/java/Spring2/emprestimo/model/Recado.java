package Spring2.emprestimo.model;

import jakarta.persistence.*;

/*
 * Parte 2 - Passo 1: Criar a entidade Recado no pacote model com id (auto-incremento), autor e texto.
 */
@Entity
public class Recado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String autor;
    private String texto;

    public Recado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

/*
 * Passo a passo:
 * Utilizado @Entity para mapear a classe como tabela no banco de dados.
 * Definido @Id e @GeneratedValue(IDENTITY) para gerar o id automaticamente a cada novo registro.
 * Criado o construtor vazio exigido pelo JPA e os getters/setters para leitura e conversão JSON.
 */