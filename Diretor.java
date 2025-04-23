import java.util.UUID;
import java.util.Calendar;


public class Diretor extends Empregado {
    // Métodos
    public Diretor (String nome, Calendar data_nascimento, Long CPF, Endereco endereco) {
        super (nome, data_nascimento, CPF, endereco);
    }

    protected String gerarMatricula() {
        return "E-" + UUID.randomUUID().toString();
    }

    protected void alterarMatricula() {
        gerarMatricula();
    }

    protected void alterarMatricula(String matricula) {
        this.matricula = matricula;
    }
}
