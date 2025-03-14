public class Aluno {
    private String nome;

    // Construtor
    public Aluno(String nome) {
        setNome(nome); // Usa o setter para validação
    }

    // Setter com validação
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + "]";
    }

    public static void main(String args[]) {
        Aluno a = new Aluno("pessoa");
        System.out.println("saida: " + a.getNome());
        System.out.println(a); // Usa o método toString() implicitamente
    }
}