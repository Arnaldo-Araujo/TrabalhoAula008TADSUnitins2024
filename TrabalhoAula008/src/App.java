import br.arnaldo.junior.GerenciadorDePessoas;
import br.arnaldo.junior.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorDePessoas gen = new GerenciadorDePessoas();
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Arnaldo de Araujo");
        pessoa1.setCpf("999.090.084-99");
        pessoa1.setIdade(43);
        gen.CadastrarPessoa(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Fulano M de Araujo");
        pessoa2.setCpf("124.235.687-98");
        pessoa2.setIdade(18);
        gen.CadastrarPessoa(pessoa2);
        gen.exibirPessoa();

        System.out.println("Atualizar nome pessoa 2");
        pessoa2.setNome("Fulano Moraes de Araujo");
        gen.atualizarPessoa(pessoa2);
        gen.exibirPessoa();

        System.out.println("Atualizar cpf pessoa 1");
        
        pessoa1.setCpf("191.365.558-22");

        gen.atualizarPessoa(pessoa1);
        gen.exibirPessoa();
    }
}
