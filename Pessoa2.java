import java.time.Month;
import java.time.Year;
import java.util.Calendar;

public class Pessoa2 {
    // Atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;

    // Métodos
    public Pessoa2 (String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade();
    }

    protected void atualizarNome(String nome) {
        this.nome = nome;
    }

    protected String recuperarNome() {
        return this.nome;
    }

    protected void atualizarIdade() {
        this.idade = calcularIdade();
    }

    protected int recuperarIdade() {
        return this.idade;
    }

    protected void atualizarCPF(long CPF) {
        this.CPF = CPF;
    }

    protected long recuperarCPF() {
        return this.CPF;
    }

    protected void atualizarEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private int calcularIdade() {
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(YEAR) - data_nascimento.get(YEAR);
        if ((data_nascimento.get(MONTH) > hoje.get(MONTH)) || (data_nascimento.get(MONTH) == hoje.get(MONTH) && data_nascimento.get(DATE) > hoje.get(DATE)))
            lapso --;
        return lapso;
    }
}
