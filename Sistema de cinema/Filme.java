public class Filme{
    private String titulo;
    private int duracao;
    private String classificacao;

    public Filme(String titulo, int duracao, String classificacao){
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracao(){
        return duracao;
    }

    public String getClassificacao(){
        return classificacao;
    }
}