import java.time.LocalTime;

public class Filme{
    private String titulo;
    private LocalTime duracao;
    private int classificacao;

    public Filme(String titulo, LocalTime duracao, int classificacao){
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public LocalTime getDuracao(){
        return duracao;
    }

    public int getClassificacao(){
        return classificacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return titulo.equals(filme.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }


    public String toString(){
        return "Titulo: " + titulo + " Duracao: " + duracao + " Classificacao: " + classificacao;
    }
}