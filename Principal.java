import java.util.Calendar;

public class Principal {
    // Atributos
    private static Aluno3 aluno;
    private static Endereco endereco;
    private static Aluno3 aluno2;
    private static Endereco endereco2;
    private static Empregado empregado, diretor;

    // Método main
    public static void main(String args[]) {
        int idade;
        // Calendar data = Calendar.getInstance();
        // data.set(1980, 10, 23);
        // Calendar ndata = Calendar.getInstance();
        // ndata.set(2007, 07, 07);
        // endereco = new Endereco("t", "t", "t", "t", "t", "t", "t");
        // endereco.setPais("Brasil");
        // endereco.setEstado("RJ");
        // endereco.setCidade("Rio de Janeiro");
        // endereco.setRua("Avenida Rio Branco");
        // endereco.setNumero("156A");
        // endereco.setCEP("20040901");
        // endereco.setComplemento("Bloco 03 - Ap 20.005");
        // endereco2 = new Endereco("t", "t", "t", "t", "t", "t", "t");
        // endereco2.setPais("Brasil");
        // endereco2.setEstado("Ceará");
        // endereco2.setCidade("Teste");
        // endereco2.setRua("Avenida Rio Branco");
        // endereco2.setNumero("156A");
        // endereco2.setCEP("20040901");
        // endereco2.setComplemento("Bloco 03 - Ap 20.005");
        // aluno = new Aluno3("Marco Antônio", data, 901564098, endereco);
        // aluno.atualizarIdade();
        // aluno2 = new Aluno3("Maria", ndata, 123456877-00, endereco2);
        // idade = aluno.recuperarIdade();
        // System.out.println(aluno);
        // System.out.println(aluno2);
        Calendar data = Calendar.getInstance();
        data.set(1988, 10, 25);
        empregado = new Empregado("Clara Silva", data, 211456937L, null);
        empregado.gerarMatricula();
        diretor = new Diretor ("Marco Antônio", data, 901564098L, null);
        diretor.gerarMatricula();
        System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
        System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());
    }
}