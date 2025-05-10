package polimorfismo_melhor;
public class Principal_polimorfismo {
    public static void main(String[] args) {
        NumeroComparavel doisNumeros = new Maior_numero2(5, 10);
        float maiorDeDois = doisNumeros.encontrarMaior(5, 10);

        NumeroComparavel tresNumeros = new Maior_numero3(1, 8, 3);
        float maiorDeTres = tresNumeros.encontrarMaior(1, 8, 3);

        System.out.println("O maior de dois números é: " + maiorDeDois);
        System.out.println("O maior de três números é: " + maiorDeTres);

        // // Você também pode armazenar em uma lista e chamar o método polimorficamente
        // java.util.List<NumeroComparavel> comparadores = new java.util.ArrayList<>();
        // comparadores.add(new Maior_numero2(15, 7));
        // comparadores.add(new Maior_numero3(2, 9, 4));

        // for (NumeroComparavel comparador : comparadores) {
        //     if (comparador instanceof Maior_numero2) {
        //         System.out.println("O maior de dois números (na lista) é: " + comparador.encontrarMaior(15, 7));
        //     } else if (comparador instanceof Maior_numero3) {
        //         System.out.println("O maior de três números (na lista) é: " + comparador.encontrarMaior(2, 9, 4));
        //     }
        // }
    }
}