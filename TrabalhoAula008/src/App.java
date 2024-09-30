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
    }
}
