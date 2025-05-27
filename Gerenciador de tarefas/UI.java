import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner; 
import java.time.format.DateTimeFormatter;

public class UI{
    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    static ArrayList<Tarefa> tarefas = new ArrayList<>();
    public static void main(String[] args){
         while (true) {
            menu();
            int numero = sc.nextInt();
            switch(numero){
                case 1: adicionarTarefa();break;
                case 2: removerTarefa();break;
                case 3: listarTarefas();break;
                case 4: fim();return;
                default: System.out.println("Opcao invalida.");break;
            }

        }
    }

    public static void menu(){
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Remover tarefa");
        System.out.println("3 - Listar tarefas");
        System.out.println("4 - Fim");
    }

    public static void adicionarTarefa(){
        sc.nextLine();
        System.out.print("Digite o nome da tarefa: ");
        String titulo = sc.nextLine();
        System.out.print("Digite a da data de vencimento da tarefa: ");
        String dataVencimento = sc.nextLine();
        System.out.print("Digite se foi concluida ou nao (False:Nao/True:Sim): ");
        boolean concluida = sc.nextBoolean();

        LocalDate dataVencimentoFormatada = LocalDate.parse(dataVencimento, formato);

        Tarefa tarefa = new Tarefa(titulo,dataVencimentoFormatada,concluida);

        tarefas.add(tarefa);
        System.out.println("A tarefa foi adicionada com sucesso.");
    }

    public static void removerTarefa(){
        sc.nextLine();
        boolean removida = false;
        System.out.print("Digite o nome da tarefa: ");
        String titulo = sc.nextLine();
        System.out.print("Digite a da data de vencimento da tarefa: ");
        String dataVencimento = sc.nextLine();
        System.out.print("Digite se foi concluida ou nao (False:Nao/True:Sim): ");
        boolean concluida = sc.nextBoolean();
        LocalDate dataVencimentoFormatada = LocalDate.parse(dataVencimento, formato);

        for (int i=tarefas.size() -1;i>=0;i--){
            Tarefa tarefaAtual = tarefas.get(i);

             if (tarefaAtual.getTitulo().equals(titulo) &&
            tarefaAtual.getDataVencimento().equals(dataVencimentoFormatada) &&
            tarefaAtual.getConcluida() == concluida) {

            tarefas.remove(i);
            removida = true;
            System.out.println("Tarefa removida com sucesso.");
        }
        }

        if (!removida){
            System.out.println("Tarefa nao encontrada.");
            return;
        }
    }

    public static void listarTarefas(){
        if(tarefas.size() == 0){
            System.out.println("Nao possui tarefas");
        }
        else{
            System.out.println("Suas tarefas:");
        }
        for (int i=0;i< tarefas.size();i++){
            Tarefa tarefaAtual = tarefas.get(i);
            System.out.println(tarefaAtual);
        }
    }

    public static void fim(){
        System.out.println("Saindo...");
    }
}