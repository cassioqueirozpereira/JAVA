package agrupamento2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista_numeros = new ArrayList<>();

        // Inserção dos elementos no arrayList
        lista_numeros.add(10);
        lista_numeros.add(20);
        lista_numeros.add(30);
        lista_numeros.add(40);
        lista_numeros.add(50);

        // Acesso aos elementos no arrayList
        System.out.println(" \nOs elementos no arrayList são: \n");
        for (int i = 0; i < lista_numeros.size(); i++) {
            System.out.println("lista[" + i + "] = " + lista_numeros.get(i));
        }

        // Remove um elemento de uma posição específica do arrayList
        lista_numeros.remove(1); // Remove o elemento da posição 2 no arrayList

        // Alterar um elemento no arrayList
        int x = 57;
        lista_numeros.set(0, x); // Coloca o elemento 57 na posição 0 do arrayList

        // Verifica se o arrayList contém um elemento específico
        int n = 100;
        String contem_elemento = lista_numeros.contains(n) ? "VERDADE":"FALSO";
        System.out.println(" \nO elemento " + n + " está no arrayList? " + contem_elemento);

        // Interar na lista através do laço for-each
        int k = 0;
        System.out.println(" \nOs elementos no arrayList são: \n");
        for (int elemento : lista_numeros) {
            System.out.println("lista[" + k + "] = " + elemento);
            k++;
        }

        // Limpar o arrayList de todos os elementos
        System.out.println(" \nLimpar o arrayList.");
        lista_numeros.clear();

        // Verifica se o arrayList está vazio
        String vazio = lista_numeros.isEmpty() ? "VERDADE" : "FALSO";
        System.out.println(" \nO arrayList está vazio? " + vazio);
    }
}
