class Escola {
    // Atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private Departamento departamentos[];
    private Aluno discentes[];
    private int nr_discentes, nr_departamentos;

    // Construtor
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamento[10];
        this.discentes = new Aluno[1000];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
    }

    public void criarDepartamento(String nomeDepartamento, int numeroDepartamento) {
        if (nr_departamentos < 10) {
            departamentos[nr_departamentos] = new Departamento(nomeDepartamento, numeroDepartamento); // Correção: adiciona o número do departamento
            nr_departamentos++;
        } else {
            System.out.println("Nao e possivel criar outro Departamento.");
        }
    }

    public void matricularAluno(Aluno novoAluno) {
        if (nr_discentes < 1000) {
            discentes[nr_discentes] = novoAluno;
            nr_discentes++;
        } else {
            System.out.println("Nao e possivel matricular mais alunos.");
        }
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}