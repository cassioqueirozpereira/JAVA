public class Referencia  {
    private Aluno2 a1 , a2;
    public Referencia  ( ) {
     a1 = new Aluno2 ( "Carlos" , 20);
     a2 = new Aluno2 ( "Ana" , 23 );
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
     System.out.println("O nome do aluno a2 é " + a2.recuperarNome());
     a2 = a1;
     a2.definirNome("Flávia");
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
     manipulaAluno ( a1 );
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
    }
    public void manipulaAluno ( Aluno2 aluno ) {
     aluno.definirNome("Márcia");
    }
    public static void main(String args[]) {
        Referencia r = new Referencia ();
        System.out.println("Fim da Execução ");
    }
}