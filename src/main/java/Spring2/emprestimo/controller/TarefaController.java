package Spring2.emprestimo.controller;

import Spring2.emprestimo.model.Tarefa;
import Spring2.emprestimo.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/*
 * Questão 4 — O controller
 * Crie a classe TarefaController no pacote controller com prefixo /tarefas,
 * GET /tarefas para listar e POST /tarefas para cadastrar retornando status 201.
 */
@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa cadastrar(@RequestBody Tarefa tarefa) {
        return service.cadastrar(tarefa);
    }
}

/*
 * Passo a passo:
 * Definido @RestController e @RequestMapping("/tarefas") para mapear a rota base da API.
 * Usado @GetMapping para retornar a lista de tarefas e @PostMapping com @RequestBody para receber o JSON e cadastrar.
 * Adicionado @ResponseStatus(HttpStatus.CREATED) para devolver o status 201 ao criar uma nova tarefa.
 */
