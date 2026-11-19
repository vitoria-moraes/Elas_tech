package Spring2.emprestimo.controller;

import Spring2.emprestimo.model.Recado;
import Spring2.emprestimo.service.RecadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/*
 * Parte 2 - Passo 4: Criar RecadoController no pacote controller com prefixo /recados, GET para listar e POST retornando 201 Created.
 */

public class RecadoController {

    private final RecadoService service;

    public RecadoController(RecadoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Recado> listar() {
        return service.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Recado cadastrar(@RequestBody Recado recado) {
        return service.cadastrar(recado);
    }
}

/*
 * Passo a passo:
 * Definido @RestController e @RequestMapping("/recados") para mapear a rota base da API.
 * Usado @GetMapping para retornar a lista de recados e @PostMapping com @RequestBody para receber o JSON e cadastrar.
 * Adicionado @ResponseStatus(HttpStatus.CREATED) para retornar o status 201 ao criar o recado.
 */