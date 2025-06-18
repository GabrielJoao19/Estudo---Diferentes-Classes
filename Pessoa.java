public class Pessoa implements Comparable<Pessoa> {
    private String nome;

    public Pessoa (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public int compareTo(Pessoa outrapessoa) {
        return this.nome.compareTo(outrapessoa.nome);
    }
}