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
        System.out.println("3 - Criar sessao");
        System.out.println("4 - Listar sessoes");
        System.out.println("5 - Adicionar filme");
        System.out.println("6 - Catalogo de filmes");
        System.out.println("7 - Reservar assento");
        System.out.println("8 - Fim");
    }

    /*Funcao 1 */
    public static void criarSala(){
        System.out.print("Informe o numero da sala: ");
        int sala = sc.nextInt();
        System.out.print("Informe a capacidade da sala: ");
        int capacidade = sc.nextInt();

        Sala salaAtual = new Sala(sala,capacidade);
        salas.add(salaAtual);
    }

    /*Funcao 2 */
    public static void listarSalas(){
        for (int i=0;i<salas.size();i++){
            Sala salaAtual = salas.get(i);
            System.out.println(salaAtual.toString());
        }
    }

    /*Funcao 3 */
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

    /*Funcao 4 */
    public static void listarSessoes(){
        for (int i =0 ;i<sessoes.size();i++){
            Sessao sessaoAtual = sessoes.get(i);
            System.out.println(sessaoAtual.toString());
        }
    }

    /*Funcao 5 */
    public static void adicionarFilme(){
        System.out.print("Informe o nome do filme: ");
        String titulo = sc.nextLine();
        System.out.print("Informe a duracao do filme: ");
        String duracao = sc.nextLine();
        System.out.print("Informe a classificacao: ");
        int classificacao = sc.nextInt();

        LocalTime duracaoFormatada = LocalTime.parse(duracao,formatoHora);

        Filme filme = new Filme(titulo,duracaoFormatada,classificacao);
        filmes.add(filme);
    }

    /*Funcao 6 */
    public static void listarFilmes(){
        for (int i = 0;i<filmes.size();i++){
            Filme filmeAtual = filmes.get(i);
            System.out.println(filmeAtual.toString());
        }
    }

    public static void reservarAssento(){
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


        for (int i =0;i<sessoes.size();i++){
            Sessao sessaoAtual = sessoes.get(i);
            if (sessaoAtual.equals(novaSessao)){
                if (sessaoAtual.getIngressos() > 0){
                    
                }
            }
        }
        
    }


}