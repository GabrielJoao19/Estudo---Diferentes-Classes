import java.time.LocalTime;
import java.util.Objects;
public class Sessao{
    private Filme filme;
    private Sala sala;
    private LocalTime horario;
    private int ingressos;

    public Sessao(Filme filme, Sala sala, LocalTime horario){
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.ingressos = sala.getCapacidade();
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

    public int getIngressos(){
        return ingressos;
    } 

    public void setIngresso(int n){
        this.ingressos = n;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sessao sessao = (Sessao) o;
    return filme.equals(sessao.filme) &&
           sala.equals(sessao.sala) &&
           horario.equals(sessao.horario);
}

    @Override
    public int hashCode() {
    return Objects.hash(filme, sala, horario);
}


    public String toString(){
        return "Filme: " + filme + " Sala: " + sala + " Horario: " + horario;
    }
}