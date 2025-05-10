package agrupamento;

public class Main {
    // Atributos
    private static Aluno aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9;
    private static Escola escola;

    // Método main
    public static void main(String args[]) {
        escola = new Escola ("Escola Pedro Alvares Cabral", "42.336.174/0006-13");
        criarAlunos();
        matricularAlunos();

        // Poderia tbm ativar somente uma das 3 funções...
        // Ativando a função 1, sem parâmetro
        escola.agruparAlunos();

        // Ativando a função 2, com número inteiro
        escola.agruparAlunos(1);

        // Ativando a função 3, com número decimal
        escola.agruparAlunos(1.5);
    }

    // Métodos
    private static void criarAlunos() {
        aluno1 = new Aluno("Marcos Antônio", "Rio de Janeiro");
        aluno2 = new Aluno("Clara Silva", "Rio de Janeiro");
        aluno3 = new Aluno("Marcos Sintra", "Sorocaba");
        aluno4 = new Aluno("João Carlos", "Sorocaba");
        aluno5 = new Aluno("Ana Beatriz", "Barra do Pirai");
        aluno6 = new Aluno("Marcos Gomes", "São Paulo");
        aluno7 = new Aluno("César Augusto", "São Paulo");
        aluno8 = new Aluno("Alejandra Gomes", "Madri");
        aluno9 = new Aluno("Castelo Branco", "São Paulo");
    }

    private static void matricularAlunos() {
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);
        escola.matricularAluno(aluno4);
        escola.matricularAluno(aluno5);
        escola.matricularAluno(aluno6);
        escola.matricularAluno(aluno7);
        escola.matricularAluno(aluno8);
        escola.matricularAluno(aluno9);
    }
}
