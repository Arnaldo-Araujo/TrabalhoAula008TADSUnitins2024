## Breve Descrição:

Este programa utiliza Orientação a objeto com encapsulamento. 
Trata-se de um gerenciador de pessoas, o sistema insere dados parcialmente ficticios, e realiza a atualização de dados através da subtituçao completa dos dados, mas poderia ser também a subistituição apenas de um campo especifico, para isso faria mais algumas alterações na logica.

## Estrutura do Projeto:

A projete segue o padrão Java, conforme abaixo:

- `src`: pasta padrão para projetos java. 
Dentro dele, criei as packages br/arnaldo/junior/model --> Com o modelo Pessoa
Um nível acima foi colocado o GerenciadorDePessoas
E temos um executavel que foi gerado pelo proprio Visual Code, utilizei ele facilitar a execução do mais para apresentar o projeto.

## Instruções de compilação e execução:

Para executar utilize o Arquivo App.java para executar o programa, para ver o que ele faz, mas vou explicar cada parte da execução já como exemplo de uso.
  
  ## Instanciei o GerenciadorDePessoas
        GerenciadorDePessoas gen = new GerenciadorDePessoas();
  ## Instanciei a pessoa1
        Pessoa pessoa1 = new Pessoa();
  ## Inseri o nome, uma String, através do metodo setNome
        pessoa1.setNome("Arnaldo de Araujo");
  ## Inseri o CPF, uma String, através do metodo setCpf
        pessoa1.setCpf("999.090.084-99");
  ## Inseri a idade através do método setIdade, nesse caso foi utilizado um inteiro.
        pessoa1.setIdade(43);
  ## Já com as duas instancias completas
  ## Nesse momento fazemos o cadastro da pessoa no método CadastrarPessoa, que esta na classe GerenciadorDePessoas       
        gen.CadastrarPessoa(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Ezequiel M de Araujo");
        pessoa2.setCpf("124.235.687-98");
        pessoa2.setIdade(18);
        gen.CadastrarPessoa(pessoa2);
        gen.exibirPessoa();
        System.out.println("Agora a troca");
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Valentina M de Araujo");
        pessoa3.setCpf("125.123.345-90");
        pessoa3.setIdade(10);
        gen.atualizarPessoa(pessoa3, pessoa1); // atualizarPessoa(novosDados, dadosAntigos);
        gen.exibirPessoa();