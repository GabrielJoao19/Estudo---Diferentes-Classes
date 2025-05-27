import java.time.LocalDate;

public class Tarefa{
    private String titulo;
    private LocalDate dataVencimento;
    private boolean concluida;

    public Tarefa(String titulo, LocalDate dataVencimento,boolean concluida){
        this.titulo = titulo;
        this.dataVencimento = dataVencimento;
        this.concluida = concluida;
    }

    public String getTitulo(){
        return titulo;
    }

     public LocalDate getDataVencimento(){
        return dataVencimento;
    }

     public boolean getConcluida(){
        return concluida;
    }

    public void concluirTarefa(){
        this.concluida = true;
    }

    public String toString(){
        return "Titulo: " + titulo + " Data de vencimento: " + dataVencimento + " Concluida: " + concluida;
    }


}