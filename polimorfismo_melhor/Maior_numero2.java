package polimorfismo_melhor;
// Subclasse para comparar dois números

public class Maior_numero2 extends NumeroComparavel {
    private float num1;
    private float num2;

    public Maior_numero2(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public float encontrarMaior(float... numeros) {
        if (numeros.length != 2) {
            throw new IllegalArgumentException("Este método espera exatamente 2 números.");
        }
        return Math.max(numeros[0], numeros[1]);
    }
}