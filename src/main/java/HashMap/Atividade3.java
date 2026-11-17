package HashMap;

import java.util.HashMap;

public class Atividade3 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma agenda (nome -> telefone)
        com duas pessoas. Use containsKey dentro de um if
        para mostrar o telefone de alguém que está na
        agenda e de alguém que não está.*/

        // 1. Criando a agenda (Chave: String -> Nome, Valor: String -> Telefone)
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Vitória", "(51) 99999-1111");
        agenda.put("Carlos", "(51) 98888-2222");

        // 2. Buscando alguém que ESTÁ na agenda
        String busca1 = "Vitória";
        if (agenda.containsKey(busca1)) {
            System.out.println("Telefone de " + busca1 + ": " + agenda.get(busca1));
        } else {
            System.out.println(busca1 + " não foi encontrado(a) na agenda.");
        }

        // 3. Buscando alguém que NÃO está na agenda
        String busca2 = "Beatriz";
        if (agenda.containsKey(busca2)) {
            System.out.println("Telefone de " + busca2 + ": " + agenda.get(busca2));
        } else {
            System.out.println(busca2 + " não foi encontrado(a) na agenda.");

        }
    }
    /*Por que usar String para o telefone?: Como números de
    telefone possuem caracteres como parênteses (), traço -
    ou espaços (e podem começar com zero), o tipo String é o mais adequado.
    agenda.containsKey(chave): Verifica se existe uma chave exata
    cadastrada no mapa antes de tentar buscar o valor, retornando true ou false.
    Segurança na Consulta: Usar containsKey dentro do if evita
    que agenda.get("Beatriz") retorne null na tela do usuário,
    permitindo exibir uma mensagem clara de que o contato não existe.*/
}
