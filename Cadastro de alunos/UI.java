public class UI{
    public static void main(String[] args){
        System.out.println("iniciando");
        Aluno aluno1 = new Aluno ("Joao", "20242014040015", "TADS");

        aluno1.adicionarNota(10);
        aluno1.adicionarNota(6.1);
        aluno1.adicionarNota(3.5);

        System.out.println(aluno1.verificarAprovacao());
    }
}