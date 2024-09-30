package br.arnaldo.junior;

import java.util.ArrayList;
import java.util.List;

import br.arnaldo.junior.model.Pessoa;

public class GerenciadorDePessoas extends Pessoa {

    private List<Pessoa> pessoas;

    public GerenciadorDePessoas(){
        this.pessoas = new ArrayList<>();
    }

    public void CadastrarPessoa(Pessoa p){
        pessoas.add(p);
    }

    public void atualizarPessoa(Pessoa pessoaAtualizada, Pessoa pessoaDesatualizada){
        pessoas.remove(pessoaDesatualizada);
        pessoas.add(pessoaAtualizada);        
    }

    public void exibirPessoa(){
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: "+pessoa.getNome()+" CPF: "+pessoa.getCpf()+" Idade: "+pessoa.getIdade()+" anos.");
        }        
    }
}
