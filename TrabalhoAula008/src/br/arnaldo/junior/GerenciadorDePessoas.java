package br.arnaldo.junior;

import java.util.ArrayList;
import java.util.List;

import br.arnaldo.junior.model.Pessoa;

public class GerenciadorDePessoas {

    private List<Pessoa> pessoas;

    public GerenciadorDePessoas(){
        this.pessoas = new ArrayList<>();
    }

    public void CadastrarPessoa(Pessoa p){
        pessoas.add(p);
    }

    public void atualizarPessoa(Pessoa p){
        for (Pessoa pessoa : pessoas) {
            if(pessoa==p){
                pessoa.setNome(p.getNome());
                pessoa.setCpf(p.getCpf());
                pessoa.setIdade(p.getIdade());
            }
        }    
    }

    public void exibirPessoa(){
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: "+pessoa.getNome()+" CPF: "+pessoa.getCpf()+" Idade: "+pessoa.getIdade()+" anos.");
        }        
    }
}
