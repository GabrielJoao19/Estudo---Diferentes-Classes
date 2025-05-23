import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Sessao{
    private Filme filme;
    private Sala sala;
    private LocalTime horario;

    public Sessao(Filme filme, Sala sala, LocalTime horario){
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
    }

    public Filme getFilme(){
        return filme;
    }

    public Sala getSala(){
        return sala;
    }

    public LocalTime getHorario(){
        return horario;
    }

    public String toString(){
        return "Filme: " + filme + " Sala: " + sala + " Horario: " + horario;
    }
}