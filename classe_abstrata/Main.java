package classe_abstrata;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Leao leao = new Leao();

        cachorro.emitirSom();
        cachorro.dormir();

        gato.emitirSom();
        gato.dormir();

        leao.tipoDeAnimal();
        leao.emitirSom();
        leao.dormir();
    }
}
