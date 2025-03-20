import java.util.Scanner;

class MyClass {
    public static void main (String[] args) {
        Scanner meuObjeto = new Scanner (System.in);
        System.out.println("Entre com o nome do usuário: ");

        String nomeUsuario = meuObjeto.nextLine();
        System.out.println("O nome do usuário é: " + nomeUsuario);
    }
}
