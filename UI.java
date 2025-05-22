public class UI{
    static ListaTelefonica listaTelefonica1 = new ListaTelefonica();
    static Contato contato1 = new Contato("Joao", "84994214509", "gama.gabrieljoao@gmail.com");
    public static void main(String[] args){
        listaTelefonica1.adicionarContato(contato1);
        listaTelefonica1.buscarContato(contato1);
    }
}