package Spring.petshop.controller;

import Spring.petshop.model.Pet;
import org.springframework.web.bind.annotation.*;

/*
 * Atividade: Pet Shop Elas Tech
 * Crie um controller chamado PetController com o prefixo /pets.
 *
 * 1. GET /pets -> Bem-vinda ao Pet Shop Elas Tech!
 * 2. GET /pets/horario -> Abrimos de segunda a sábado, das 8h às 18h.
 * 3. GET /pets/destaque -> JSON: { "nome": "Thor", "especie": "Cachorro", "idade": 3 }
 * 4. GET /pets/adotar/{nome} -> Parabéns! Você adotou {nome}!
 * 5. GET /pets/banho -> recebe pet via ?, padrão "Seu pet": {pet} está tomando banho!
 * 6. GET /pets/novo/{nome} -> devolve JSON de um gato filhote com o nome da URL
 * 7. GET /pets/idade-humana -> recebe anos via ? e multiplica por 7
 * Desafio. GET /pets/consulta -> recebe pet e vet via ?: {pet} tem consulta com a Dra. {vet}!
 */
@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping
    public String boasVindas() {
        return "Bem-vinda ao Pet Shop Elas Tech!";
    }

    @GetMapping("/horario")
    public String horarioFuncionamento() {
        return "Abrimos de segunda a sábado, das 8h às 18h.";
    }

    @GetMapping("/destaque")
    public Pet petDestaque() {
        return new Pet("Thor", "Cachorro", 3);
    }

    @GetMapping("/adotar/{nome}")
    public String adotarPet(@PathVariable String nome) {
        return "Parabéns! Você adotou " + nome + "!";
    }

    @GetMapping("/banho")
    public String darBanho(@RequestParam(defaultValue = "Seu pet") String pet) {
        return pet + " está tomando banho!";
    }

    @GetMapping("/novo/{nome}")
    public Pet novoGato(@PathVariable String nome) {
        return new Pet(nome, "Gato", 1);
    }

    @GetMapping("/idade-humana")
    public String calcularIdadeHumana(@RequestParam int anos) {
        int idadeHumana = anos * 7;
        return anos + " anos de pet equivalem a " + idadeHumana + " anos humanos!";
    }

    @GetMapping("/consulta")
    public String agendarConsulta(@RequestParam String pet, @RequestParam String vet) {
        return pet + " tem consulta com a Dra. " + vet + "!";
    }
}

/*
 * Passo a passo:
 * Utilizado @RestController para expor os endpoints e @RequestMapping("/pets") para definir o prefixo base.
 * Usado @GetMapping para mapear as requisições GET e retornar strings ou objetos Pet convertidos automaticamente em JSON.
 * Aplicado @PathVariable para capturar valores direto da URL (/adotar/{nome} e /novo/{nome}).
 * Aplicado @RequestParam para ler parâmetros após o ? (/banho, /idade-humana e /consulta), usando defaultValue no banho para o valor padrão.
 *
 * Resposta item 7: Ao acessar /pets/idade-humana sem o parâmetro ?anos=, ocorre um erro 400 (Bad Request) porque o @RequestParam é obrigatório por padrão e o Spring barra a requisição quando o valor não é enviado.
 */
