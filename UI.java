import java.util.*;
public class UI {
    public static void main(String[]args){
    ArrayList <Pessoa> pessoas = new ArrayList<>();
    Pessoa pessoa1 = new Pessoa("Joao");
    Pessoa pessoa2 = new Pessoa("Gabriel");
    Pessoa pessoa3 = new Pessoa("Caio");

    pessoas.add(pessoa1);
    pessoas.add(pessoa2);
    pessoas.add(pessoa3);
    
    pessoas.sort(null);

    for (Pessoa pessoa : pessoas){
        System.out.println(pessoa.getNome());
    }

    }
    

}
