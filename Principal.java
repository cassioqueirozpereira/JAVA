import java.util.Calendar;

public class Principal {
    // Atributos
    private static Aluno3 aluno;
    private static Endereco endereco;

    // Método main
    public static void main(String args[]) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco();
        endereco.setPais("Brasil");
        endereco.setEstado("RJ");
        endereco.setCidade("Rio de Janeiro");
        endereco.setRua("Avenida Rio Branco");
        endereco.setNumero("156A");
        endereco.setCEP("20040901");
        endereco.setComplemento("Bloco 03 - Ap 20.005");
        aluno = new Aluno3("Marco Antônio", data, 901564098, endereco);
        aluno.atualizarIdade();
        idade = aluno.recuperarIdade();
    }
}