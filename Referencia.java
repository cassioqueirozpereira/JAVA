public class Referencia  {
    private Aluno2 a1 , a2;
    public Referencia  ( ) {
     a1 = new Aluno2 ( "Carlos" , 20);
     a2 = new Aluno2 ( "Ana" , 23 );
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome() + " e a idade é " + a1.recuperarIdade());
     System.out.println("O nome do aluno a2 é " + a2.recuperarNome() + " e a idade é " + a2.recuperarIdade());
     a2 = a1;
     a2.definirNome("Flávia");
     a2.definirIdade(30);
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome() + " e a idade é " + a1.recuperarIdade());
     System.out.println("O nome do aluno a1 é " + a2.recuperarNome() + " e a idade é " + a2.recuperarIdade());
     manipulaAluno ( a1 );
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome() + " e a idade é " + a1.recuperarIdade());
     System.out.println("O nome do aluno a1 é " + a2.recuperarNome() + " e a idade é " + a2.recuperarIdade());
    }
    public void manipulaAluno ( Aluno2 aluno ) {
     aluno.definirNome("Márcia");
     aluno.definirIdade(40);
    }
    public static void main(String args[]) {
        Referencia r = new Referencia ();
        System.out.println("Fim da Execução ");
    }
}