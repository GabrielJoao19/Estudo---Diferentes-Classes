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

    public void buscarContato(Contato contato){
        for (int i = 0; i < contatos.size(); i++){
            Contato contato_atual = contatos.get(i);
            if (contato_atual.getTelefone().equals(contato.getTelefone())){
                System.out.println("O contato foi encontrado, segue abaixo seus dados.");
                String contato_final = contato_atual.toString();
                System.out.println(contato_final); 
            }
        }
    }
}