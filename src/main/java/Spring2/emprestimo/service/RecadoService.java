package Spring2.emprestimo.service;

import Spring2.emprestimo.model.Recado;
import Spring2.emprestimo.repository.RecadoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

/*
 * Parte 2 - Passo 3: Criar a classe RecadoService no pacote service com os métodos listar e cadastrar.
 */
@Service
public class RecadoService {

    private final RecadoRepository repository;

    public RecadoService(RecadoRepository repository) {
        this.repository = repository;
    }

    public List<Recado> listar() {
        return repository.findAll();
    }

    public Recado cadastrar(Recado recado) {
        return repository.save(recado);
    }
}

/*
 * Passo a passo:
 * Anotada a classe com @Service e injetado o RecadoRepository pelo construtor.
 * Criados os métodos listar() usando findAll() e cadastrar() usando save() para fazer a ponte com o banco.
 */