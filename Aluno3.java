import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aluno3 extends Pessoa2 {
    // Atributos
    private String matricula;

    // Métodos
    public Aluno3 (String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super (nome, data_nascimento, CPF, endereco);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Aluno{" +
            "nome='" + recuperarNome() + '\'' +
            ", dataNascimento=" + sdf.format(getDataNascimento().getTime()) +
            ", CPF=" + recuperarCPF() +
            ", matricula='" + getMatricula() + '\'' +
            ", endereco=" + getEndereco() +
            ", idade=" + recuperarIdade() +
            '}';
    }
}
