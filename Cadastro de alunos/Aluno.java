import java.util.List;
import java.util.ArrayList;

public class Aluno{
    private String nome;
    private String matricula;
    private String curso;
    private List <Double> notas;

    public Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota){
        notas.add(nota);
    }

    public double calcularMedia(){
        double somaNota = 0;
        for (int i=0;i<notas.size();i++){
            somaNota+= notas.get(i);
        }
        double media = somaNota / notas.size();
        return media;
    }

    public String verificarAprovacao(){
        double media = this.calcularMedia();
        if(media >= 60){
            return "Aprovado";
        }
        return "Reprovado";
    }


}