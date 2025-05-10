package polimorfismo_melhor;

// Subclasse para comparar três números
public class Maior_numero3 extends NumeroComparavel {
    private float num1;
    private float num2;
    private float num3;

    public Maior_numero3(float num1, float num2, float num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public float encontrarMaior(float... numeros) {
        // Se a quantidade de números for diferente de 3)
        if (numeros.length != 3) {
            throw new IllegalArgumentException("Este método espera exatamente 3 números.");
        }
        return Math.max(numeros[0], Math.max(numeros[1], numeros[2]));
    }
}