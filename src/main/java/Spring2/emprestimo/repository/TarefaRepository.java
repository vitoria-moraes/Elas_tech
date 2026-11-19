package Spring2.emprestimo.repository;

import Spring2.emprestimo.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Questão 2 — O repository
 * Crie a interface TarefaRepository no pacote repository estendendo JpaRepository com os tipos da entidade e do id.
 */
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}

/*
 * Passo a passo:
 * Criada a interface estendendo JpaRepository<Tarefa, Long> para herdar os métodos prontos de banco de dados (save, findAll, etc.) sem precisar escrever SQL.
 */