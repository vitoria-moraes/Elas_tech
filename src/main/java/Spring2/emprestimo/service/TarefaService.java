package Spring2.emprestimo.service;

import Spring2.emprestimo.model.Tarefa;
import Spring2.emprestimo.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

/*
 * Questão 3 — O service
 * Crie a classe TarefaService no pacote service com os métodos de listar todas as tarefas e cadastrar uma nova.
 */
@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Tarefa cadastrar(Tarefa tarefa) {
        return repository.save(tarefa);
    }
}

/*
 * Passo a passo:
 * Anotada a classe com @Service e injetado o TarefaRepository via construtor.
 * Implementados os métodos listar() usando findAll() e cadastrar() usando save() para intermediar o acesso ao banco.
 */
