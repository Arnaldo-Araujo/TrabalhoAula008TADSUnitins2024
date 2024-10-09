## Cabeçalho:
### Aluno: Arnaldo B A Junior; 
### Turma: 2024-1 TADS 2º;
### Período: 2º Período; e 
### Disciplina: Programação Orientada a Objetos.

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
  
  ### Instanciei o GerenciadorDePessoas
        GerenciadorDePessoas gen = new GerenciadorDePessoas();
  ### Instanciei a pessoa1
        Pessoa pessoa1 = new Pessoa();
  ### Inseri o nome, uma String, através do metodo setNome
        pessoa1.setNome("Arnaldo de Araujo");
  ### Inseri o CPF, uma String, através do metodo setCpf
        pessoa1.setCpf("999.090.084-99");
  ### Inseri a idade através do método setIdade, nesse caso foi utilizado um inteiro.
        pessoa1.setIdade(43);
  ### Já com as duas instancias completas
  #### Nesse momento fazemos o cadastro da pessoa no método CadastrarPessoa, que esta na classe GerenciadorDePessoas       
        gen.CadastrarPessoa(pessoa1);

  ### Nessas proximas linhas fiz o mesmo para pessoa2      
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Ezequiel M de Araujo");
        pessoa2.setCpf("124.235.687-98");
        pessoa2.setIdade(18);
  ### Bem como cadastrei a pessoa2, que foi para o final da lista de pessoas.
        gen.CadastrarPessoa(pessoa2);
  ### Aqui imprimi o resultado parcial do que foi feito até agora.
        gen.exibirPessoa();
  #### Agora vou repetir o metodo de instacial uma pessoa3 neste caso vou atualizar a pessoa completa, mas também poderia fazer outra implementação para atualizar a pessoa.
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Valentina M de Araujo");
        pessoa3.setCpf("125.123.345-90");
        pessoa3.setIdade(10);
 #### Depois da nova pessoa criada, atualizei a pessoa utilizando o metodo abaixo conforme exemplificado novosDados, subistitui dadosAntigos
        gen.atualizarPessoa(pessoa3, pessoa1); // atualizarPessoa(novosDados, dadosAntigos);
 ### Aqui vou exibir novamente a lista de pessoas para ver que foi totalmente atualizadas
        gen.exibirPessoa();

 ### Sobre a logica do encapsulamento e que foi aplicada

 ### Na Classe Pessoa
 Criei os atributos nome e cpf como string com acesso privado, também criei o atributo idade como int (inteiro) também com acesso privado, crie os metodos getters e setters para que pudesse ser modificado dentro da instancia.
 ### Na Classe GerenciadorDePessoas
 Inicialmente crie uma atributo do tipo Lista(List), e instanciei no construtor da classe GerenciadorDePessoas
 Depois crie três metodos
 ### O primeiro método foi CadastrarPessoa
 Foi um metodo sem retorno mas que tinha como função, receber um objeto do tipo Pessoa e adicionar na lista de Pessoas.
 Ao ser instaciada a Classe GerenciadorDePessoas no metodo main, pode-se perceber que os metodos exemplificam o que faz cada um, porém como que é feito, somente dentro da classe que pode ser visto como tudo acontece.
### O seguindo método é o atualizarPessoa
Nesse metodo também sem retorno a função dele faz com que o primeiro objeto pessoa seja trocado pelo segundo objeto também sem que a classe que executa saiba o como ele faz a troca. 

### O terceiro método e ultimo exibirPessoas
Percorre a lista de pessoas Criadas em CadastrarPessoa, atravez do foreach e exibe os dados na tela.


# Título do Projeto

## Diagrama de Fluxo

```mermaid

%% source,target,value
Electricity grid,Over generation / exports,104.453
Electricity grid,Heating and cooling - homes,113.726
Electricity grid,H2 conversion,27.14
