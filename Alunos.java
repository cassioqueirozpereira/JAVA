import java.util.Random;

public class Alunos { 
    // Atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    // Construtor
    public Alunos(String nome, int idade) {
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    // Métodos
    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Alunos novoAluno = new Alunos("teste de instanciação", 50);
        // Agora você pode usar 'novoAluno' aqui dentro do método main
        System.out.println("Nome do aluno: " + novoAluno.nome); // Exemplo de uso
    }
}