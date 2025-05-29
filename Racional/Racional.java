public class Racional{
    //DEIXA OS ATRIBUTOS IMUTAVEIS
    private final int num,den;
    //ADICIONAR NO CONSTRUTOR METODO DE MDC
    //PODEM TER VARIOS CONSTRUTORES
    public Racional(int num, int den){
        this.num = num;
        this.den = den;
    }

    public Racional(int num){
        // this(num,1)
        this.num = num;
        this.den = 1;
    }

    public Racional(){
        this(0,1);
    }

    public int getNum(){
        return this.num;
    }

     public int getDen(){
        return this.den;
    }

    public Racional vezes(Racional outro){
        int num = this.num * outro.num;
        int den = this.num * outro.den;
        return new Racional(num,den);
    }

    public Racional vezes(int outro){
        return vezes(new Racional(num));
    }
}