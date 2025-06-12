public class Livro{
    private String livro, autor;
    private int ano;


    public Livro(String livro, String autor, int ano){
        this.livro = livro;
        this.autor = autor;
        this.ano = ano;
    }

    public String getLivro(){
        return livro;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }

    public String toString(){
        return "Livro: " + livro + " Autor: " + autor + " Ano: " + ano;
    }
}