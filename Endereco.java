public class Endereco {
    // Atributos
    private String nome_rua;
    private int numero;

    // Construtor
    public Endereco(String nome_rua, int numero) {
        this.nome_rua = nome_rua;
        this.numero = numero;
    }

    // Getters e setters (Métodos)
    public String getNomeRua() {
        return nome_rua;
    }

    public void setNomeRua(String nome_rua) {
        this.nome_rua = nome_rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}