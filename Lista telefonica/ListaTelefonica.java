import java.util.ArrayList;

public class ListaTelefonica{
    ArrayList <Contato> contatos;

    public ListaTelefonica(){
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public void removerContato(Contato contato){
        contatos.remove(contato);
    }

    public int getSize(){
        return contatos.size();
    }

    public Contato getIndex(int index){
        return contatos.get(index);
    }

    public void listarContatos(){
        for (int i = 0; i< contatos.size();i++){
            Contato contatoAtual =  contatos.get(i);
            System.out.println(contatoAtual.toString());
        }
    }
}