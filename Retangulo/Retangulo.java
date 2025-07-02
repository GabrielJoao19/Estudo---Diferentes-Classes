public class Retangulo{
    private double b, h;

    public Retangulo(double b, double h){
        this.b = b;
        this.h = h;
    }

    public double getBase(){
        return b;
    }

    public double getAltura(){
        return h;
    }

    public double calcArea(){
        return h*b;
    }

    public double calcDiagonal(){
        return Math.sqrt(Math.pow(b,2) + Math.pow(h,2));
    }

    public String toString(){
        return "Base: " + b + " Altura: " + h;
    }
}