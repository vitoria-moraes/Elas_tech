package ListaDeRevisao2;

public class Atividade1 {
    public static void main(String[] args) {
        /*Lista de Atividades — Módulo 1
Fundamentos de Java

Não precisa fazer os assuntos que você já domina.


Crie um package para a lista. Crie uma classe por assunto.
📄 Tem um PDF junto com essa lista com a explicação de cada assunto e a referência de sintaxe, junto com as atividades. Consulte sempre que precisar lembrar o formato de alguma estrutura. Pode fazer a lista completa usando apenas ele.



Variáveis e tipos
Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.

Crie uma variável cidade e imprima: "Eu moro em Salvador."

Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.

Crie uma variável preco com 29.90 e imprima o valor dela numa frase.

Crie uma variável temCarteira com true e imprima.


🔥 Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.

💡 Se você fizer a = b, o valor antigo de a se perde. Você vai precisar de uma terceira variável pra guardar alguma coisa antes.



Operadores
Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.

Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.

Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.

Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.

Crie um número e imprima o resto da divisão dele por 2.

Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.

🔥 Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?

💡 Uma comparação já produz true ou false sozinha — não precisa de if pra isso. E um número é divisível por outro quando o resto da divisão é zero.



Concatenação e printf
Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."

Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.

Crie uma variável com o preço de um produto e imprima com duas casas decimais.

Usando printf, imprima numa linha só o nome, a idade e a altura.

🔥 Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.

💡 Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.



Scanner
Pergunte o nome da pessoa e responda: "Olá, [nome]!"

Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.

Pergunte dois números e mostre a soma.

Pergunte a altura e o peso e imprima os dois numa frase.

🔥 Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto). Depois imprima tudo numa ficha.

💡 Rode primeiro sem nenhum cuidado especial e veja o que acontece com a pergunta do nome. Quando você digita um número e aperta Enter, o nextInt() pega o número e deixa o Enter para trás. O nextLine() seguinte encontra esse Enter e acha que você não digitou nada.



Condicionais
Peça a idade e diga se a pessoa é maior ou menor de idade.

Peça um número e diga se ele é par ou ímpar.

Peça dois números e diga qual é o maior. Se forem iguais, avise.

Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".

Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.

Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.

🔥 Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero; dois iguais → Isósceles; todos diferentes → Escaleno.

💡 A ordem dos testes importa. Repare que um triângulo equilátero também tem dois lados iguais — então, se o teste do isósceles vier primeiro, nenhum equilátero vai ser encontrado.



Loops
Imprima os números de 1 a 20, um por linha.

Imprima a contagem regressiva de 10 até 1 e depois "Fim!".

Peça um número e mostre a tabuada dele de 1 a 10.

Imprima só os números pares de 1 a 30.

Usando for, some todos os números de 1 a 100 e mostre o resultado.

Refaça o primeiro exercício com while. Compare os dois códigos.

Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.

🔥 Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura:

Digite a altura: 5 * ** *** **** *****
💡 Você vai precisar de um laço dentro do outro. O de fora controla a linha; o de dentro imprime os asteriscos daquela linha. Repare que a quantidade de asteriscos muda conforme a linha.



Arrays
Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.

Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.

Com o mesmo array, calcule e imprima a soma e a média.

Crie um array com 5 números e descubra qual é o maior.

Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.

🔥 Mini-desafio — Crie um array com 5 nomes. Peça um nome pra pessoa e diga em qual posição ele está. Se não estiver na lista, avise.

💡 Crie uma variável valendo -1 antes do laço — ela significa "ainda não encontrei". Se achar, guarde a posição nela. Depois do laço, se ela ainda valer -1, é porque não estava na lista.



Strings
Peça o nome completo e mostre quantas letras ele tem.

Peça o nome e mostre em MAIÚSCULO e em minúsculo.

Peça o nome e mostre a primeira letra.

Peça uma frase e uma palavra. Diga se a palavra aparece na frase.

Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.

Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).

🔥 Mini-desafio — Peça uma palavra e diga se ela começa e termina com a mesma letra, ignorando maiúscula e minúscula.
Exemplos: ana → sim · Ovo → sim · casa → não

💡 A primeira letra está na posição 0. A última está na posição length() - 1, porque a contagem começa no zero. E pra ignorar maiúscula, converta a palavra inteira antes de comparar.



Classes e objetos
Crie uma classe Pet com nome, raca e peso. Em outra classe, crie um objeto, preencha e imprima tudo.

Continuando, crie dois pets diferentes e imprima as duas fichas.

Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.

Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.

🔥 Mini-desafio — Crie uma classe Jogadora com nome e pontos. Crie três jogadoras com pontuações diferentes e descubra qual tem a maior pontuação. Imprima o nome dela.

💡 Compare os atributos pontos de cada objeto, igual você compararia números comuns. Guarde numa variável o nome da jogadora com a maior pontuação encontrada até agora.



Métodos
💡 Lembrete: se for criar e chamar os métodos dentro do mesmo arquivo onde está o main, não esqueça de colocar a palavra static antes deles (ex: static void mostrarBoasVindas()).

Crie um método mostrarBoasVindas() que imprime uma mensagem. Chame no main.

Crie saudacao(String nome) que imprime "Olá, [nome]!". Chame três vezes com nomes diferentes.

Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.

Crie calcularMedia(double n1, double n2) que devolve a média. Mostre com duas casas decimais.

Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.

Crie dois métodos somar: um que recebe dois números e outro que recebe três.

🔥 Mini-desafio — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. Depois crie outro método, liberarEntrada(int idade), que chama o primeiro e imprime se a pessoa pode entrar ou não. No main, chame apenas o segundo.

💡 Um método pode chamar outro normalmente, basta escrever o nome dele. E como o primeiro devolve true ou false, esse resultado pode ir direto dentro de um if.



Tratamento de exceções
Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.

Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.

Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.

Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.

Crie um array com 3 nomes e tente imprimir a posição 5. Trate a exceção e, depois do try/catch, imprima "O programa continua funcionando."

🔥 Mini-desafio — Faça um programa com um try e três catch diferentes: um para divisão por zero, um para posição inválida de array e um genérico (Exception) no final. Teste cada situação e veja qual catch é acionado.

💡 O catch (Exception e) pega qualquer erro, então ele precisa ser o último. Se vier antes dos outros, o código nem compila — os de baixo nunca seriam alcançados.



🏆 Desafio Final — Meu Catálogo de Filmes
Esse é o desafio que junta tudo do módulo num programa só. Não é obrigatório, e não precisa fazer de uma vez.

Construa por partes. Faça um pedaço, rode, confira, e só então siga.

O que o programa faz
Um catálogo onde você cadastra os filmes que assistiu, com nota e gênero, e consegue consultar depois.

A classe
Crie uma classe Filme, em arquivo separado e sem main, com:

titulo (texto)

genero (texto)

nota (decimal)

classificacao (texto)

O menu
O programa mostra o menu e fica rodando até a pessoa escolher sair:

=== MEU CATÁLOGO ===
1 - Cadastrar filme
2 - Listar filmes
3 - Buscar por título
4 - Estatísticas
5 - Sair
Escolha:

O que cada opção faz
1 — Cadastrar

Pede título, gênero e nota. Guarda o gênero em maiúsculo. A classificação o programa define sozinho, a partir da nota:

8 ou mais → Ótimo

5 a 7.9 → Bom

menos de 5 → Ruim

2 — Listar

Mostra todos os filmes cadastrados, um por linha:

Matrix [FICÇÃO] - Nota 9.0 - Ótimo Titanic [DRAMA] - Nota 6.5 - Bom
3 — Buscar por título

Pede um título e mostra os dados daquele filme. A busca deve funcionar mesmo se a pessoa digitar em minúsculo. Se não achar, avisa.

4 — Estatísticas

Mostra:

quantos filmes estão cadastrados

a média das notas, com duas casas decimais

o título do filme com a maior nota

quantos filmes são "Ótimo"

5 — Sair

Mensagem de despedida e encerra.

Qualquer outro número → "Opção inválida"

Regras obrigatórias
Use um array para guardar os filmes (comece com 5 posições)
​2. Use um contador pra saber quantos foram cadastrados de verdade

A classificação é calculada por um método que recebe a nota e devolve o texto

Use printf com duas casas decimais na média e uma na nota

Se a pessoa digitar letra no menu, o programa não pode quebrar — trate a exceção

Não deixe cadastrar mais filmes do que o array comporta

Exemplo de execução
Escolha: 1 Título: Matrix Gênero: ficção Nota (0 a 10): 9 Filme cadastrado! Escolha: 4 Total de filmes: 2 Média das notas: 7.75 Melhor filme: Matrix Filmes ótimos: 1 de 2 Escolha: x Digite apenas números!
Dicas
💡 Comece pelo menu vazio. Faça o while com o switch e cada case só imprimindo "cheguei aqui". Rode. Depois preencha um de cada vez.

💡 Para achar o filme com a maior nota, guarde a posição do melhor, não só a nota. Assim você consegue acessar o título depois.

💡 No laço, use i < total, não i < filmes.length. As posições vazias dariam erro.

💡 Depois do nextInt() do menu, coloque um sc.nextLine() pra limpar. Sem isso, a pergunta do título é pulada.

💡 Dentro do catch também precisa de sc.nextLine(). Sem ele, vira loop infinito.

💡 Criar o array de filmes não cria os filmes automaticamente! Antes de preencher o título e a nota de um filme novo, você precisa instanciá-lo na posição correta (ex: filmes[i] = new Filme();).

Se terminar e quiser ir além
Não deixe cadastrar nota fora do intervalo de 0 a 10

Acrescente uma opção que lista só os filmes de um gênero

Acrescente um atributo assistido (verdadeiro ou falso) e mostre na ficha

Mostre também o pior filme nas estatísticas

Deixe listar os filmes em ordem da maior nota para a menor*/
    }
}
