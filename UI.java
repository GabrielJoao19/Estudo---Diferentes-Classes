import java.util.Scanner;

public class UI{
    static Scanner scanner = new Scanner(System.in);
    static ListaTelefonica listaTelefonica1 = new ListaTelefonica();
    public static void main(String[] args){
        while (true){
            menu();
            int numero = scanner.nextInt();
            switch (numero) {
                case 1: inserirContato(); break;
                case 2: listarContatos(); break;
                case 3: buscarContato(); break;
                case 4: removerContato(); break;
                case 5: fim(); return;
                default: System.out.println("Opcao invalida"); break;
            }
        }
    }

    public static void menu(){
        System.out.println("1 - Inserir contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Buscar contato");
        System.out.println("4 - Remover contato");
        System.out.println("5 - Fim");
    }
    /*Funcao 1 */
    public static void inserirContato(){
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        Contato contato = new Contato(nome, telefone, email);

        listaTelefonica1.adicionarContato(contato);
        System.out.println("\n");
        System.out.println("Seu contato foi adicionado");
    }
    /*Funcao 2 */
    public static void listarContatos(){
        listaTelefonica1.listarContatos();
    }
    /*Funcao 3 */
    public static void buscarContato(){
        System.out.println("Qual contato gostaria de buscar na lista? ");
        String nomeContato = scanner.nextLine();

        if  (listaTelefonica1.getSize() == 0){
            System.out.println("Nao ha contatos na lista telefonica.");
            return;
        }

        for (int i =0; i< listaTelefonica1.getSize();i++){
            Contato contatoAtual = listaTelefonica1.getIndex(i);
            if (contatoAtual.getNome().equals(nomeContato)){
                System.out.println("O contato foi encontrado, segue abaixo seus dados.");
                String contatoAchado = contatoAtual.toString();
                System.out.println("contatoAchado");
            }
            else{
                System.out.println("O contato informado nao foi encontrado.");
            }
        }


    }
    
    public static void removerContato(){
        System.out.print("Digite o nome do contato que deseja remover: ");
        String nome =  scanner.nextLine();

        System.out.print("Digite o numero do contato que deseja remover: ");
        String telefone = scanner.nextLine();

        if  (listaTelefonica1.getSize() == 0){
            System.out.println("Nao ha contatos na lista telefonica.");
            return;
        }

        for (int i =0; i< listaTelefonica1.getSize();i++){
            Contato contatoAtual = listaTelefonica1.getIndex(i);
            if (contatoAtual.getNome().equals(nome) && contatoAtual.getTelefone().equals(telefone)){
                listaTelefonica1.removerContato(contatoAtual);
                System.out.println("Contato removido.");
            }
            else {
                System.out.println("Contato informado nao encontrado.");
            }
        }

    }


    public static void fim(){
        System.out.println("Saindo");
    }
}