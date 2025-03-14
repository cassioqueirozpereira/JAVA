public class Departamento {
    // Atributos
    private String nome;
    private int numero;

    // Construtor
    public Departamento(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Getters e setters (Métodos)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}