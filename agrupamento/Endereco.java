package agrupamento;

public class Endereco {
    // Atributos
    private String pais;
    private String estado;
    private String cidade;
    private String rua;
    private String numero;
    private String CEP;
    private String complemento;

    // Construtor
    public Endereco(String pais, String estado, String cidade, String rua, String numero, String CEP, String complemento) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.complemento = complemento;
    }

    // Setters and Getters (Métodos)
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCEP() {
        return CEP;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }
    
    @Override
    public String toString() {
        return "Endereço{" +
            "pais='" + pais + '\'' +
            ", estado='" + estado + '\'' +
            ", cidade='" + cidade + '\'' +
            ", rua='" + rua + '\'' +
            ", numero='" + numero + '\'' +
            ", CEP='" + CEP + '\'' +
            ", complemento='" + complemento + '\'' +
            '}';
    }
}