package Spring2.emprestimo.repository;

import Spring2.emprestimo.model.Recado;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Parte 2 - Passo 2: Criar a interface RecadoRepository no pacote repository estendendo JpaRepository.
 */
public interface RecadoRepository extends JpaRepository<Recado, Long> {
}

/*
 * Passo a passo:
 * Criada a interface estendendo JpaRepository<Recado, Long> para herdar os métodos prontos de acesso ao banco (save, findAll, etc.) sem precisar escrever SQL manual.
 */