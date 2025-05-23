public class Sala{
    private int numero;
    private int capacidade;

    public Sala(int numero, int capacidade){
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero(){
        return numero;
    }

    public int getCapacidade(){
        return capacidade;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sala sala = (Sala) o;
    return numero == sala.numero;
}

    @Override
    public int hashCode() {
    return Integer.hashCode(numero);
}


    public String toString(){
        return "Numero da sala: " + numero + "Capacidade da sala: " + capacidade;
    }
}
