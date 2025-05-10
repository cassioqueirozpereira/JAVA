package classe_abstrata;

public abstract class Animal {
    // Método abstrato
    public abstract void emitirSom();

    // Método concreto
    public void dormir() {
        System.out.println("Zzzzzzz...\n");
    }
}
