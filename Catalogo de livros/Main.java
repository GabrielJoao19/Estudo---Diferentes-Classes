import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    Scanner sc = new Scanner(System.in);
    Catalogo catalogo = new Catalogo();
    ArrayList <String> autores = new ArrayList<>();
    public static void main(String[]args){

    }

    public static void cadastrarLivro(){
        System.out.print("Digite o nome do livro: ");
        String nome = sc.nextline();
        System.out.print("Digite o autor do livro: ");
        String autor = sc.nextline();
        System.out.print("Digite o ano do livro: ");
        int ano = sc.nextInt();

        Livro livro = new Livro(nome, autor, ano);
    
        for (int i = 0; i< catalogo.size();i++){
            Livro livroAtual = catalogo.get(i);
            if (livro.getNome().equals(livroAtual.getNome()) && livro.getAutor().equals(livroAtual.getAutor())){
                System.out.println("Livro ja existe.")
                return;                
            }
        }

        catalogo.add(livro);

        for (int i = 0; i< autores.size();i++){
            String atorAtual = autores.get(i);
            if (!livro.getAutor().equals(atorAtual)){
                autores.add(livro.getAutor());
            }
        }
        
        System.out.println("Livro cadastrado.")
    }

    public static void listarLivros(){
        for (int i = 0; i< catalogo.size();i++){
            Livro livroAtual = catalogo.get(i);
            System.out.println(livroAtual);
        }
    }

    public static void buscarLivro(String nome){
        for (int i = 0; i< catalogo.size();i++){
            Livro livroAtual = catalogo.get(i);
            if (nome.equals(livroAtual.getLivro())){
                System.out.println("Livro encontrado.");
                System.out.println(livroAtual);
            }
        }
    }

    public static void listarAutores(){
        for (int i=0;i<autores.size();i++){
           String autorAtual = autores.get(i);
           System.out.println(autorAtual);
        }
    }

    public static void mostrarLivrosPorAno(){
        
    }
}   
