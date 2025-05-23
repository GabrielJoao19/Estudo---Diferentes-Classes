import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    static Sessao sessoes = new ArrayList();
    static Filme filmes = new ArrayList();
    static Sala salas = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
    public static void main(String[] args) {
    
    }

    public static void menu(){
        System.out.println("1 - Criar sala");
        System.out.println("2 - Listar salas");
        System.out.println("1 - Criar sessao");
        System.out.println("2 - Listar sessoes");
        System.out.println("5 - Adicionar filme");
        System.out.println("4 - Catalogo de filmes");
        System.out.println("5 - Fim");
    }

    public static void criarSessao(){
        Filme filme = null;
        Sala sala = null;
        System.out.print("Informe o titulo do filme: ");
        String titulo = sc.nextLine();

        System.out.print("Informe o numero da sala: ");
        int numeroSala = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe o horario: ");
        String horario = sc.nextLine();
        LocalTime horaFormatada = LocalTime.parse(horario,formatoHora);

        for (int i = 0;i<filmes.size();i++){
            Filme filmeAtual = filmes.get(i);
            if (filmeAtual.getTitulo().equals(titulo)){
                filme = filmeAtual;
                break;
            }               
        }
        
        if (filme == null){
            System.out.println("Filme nao encontrado.");
            return;
        }

        for (int i =0;i<salas.size();i++){
            Sala salaAtual = salas.get(i);
            if (salaAtual.getNumero() == numeroSala){
                sala = salaAtual;
                break;
            }
        }

        if (sala == null){
            System.out.println("Sala nao encontrada.");
            return;
        }

        Sessao novaSessao = new Sessao(filme,sala,horaFormatada);
        sessoes.add(novaSessao);
    }
    
    public static void listarSessoes(){
        for (int i =0 ;i<sessoes.size();i++){
            Sessao sessaoAtual = sessoes.get(i);
            System.out.println(sessaoAtual.toString());
        }
    }

    public static void reservarAssento(){
        System.out.print("Informe a sessão que deseja para o ingresso:");
        System.out.print("Filme:");
        String filme = sc.nextLine();
        System.out.print("Horario:");
        String horario = sc.nextLine();
        LocalTime horaFormatada = LocalTime.parse(horario,formatoHora);
        System.out.print("Sala:");
        int sala = sc.nextInt();

        
    }


}