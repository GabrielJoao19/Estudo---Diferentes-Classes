import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
public class Ui{
    static ArrayList<Sessao> sessoes = new ArrayList<>();
    static ArrayList<Filme> filmes = new ArrayList<>();
    static ArrayList<Sala> salas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
    public static void main(String[] args) {
        while (true) {
            menu();
            int numero = sc.nextInt();
            switch(numero){
                case 1: criarSala();break;
                case 2: listarSalas();break;
                case 3: criarSessao();break;
                case 4: listarSessoes();break;
                case 5: adicionarFilme();break;
                case 6: listarFilmes();break;
                case 7: reservarAssento();break;
                case 8: fim();return;
                default: System.out.println("Opcao invalida.");break;
            }

        }
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
        sc.nextLine();
        System.out.print("Informe o nome do filme: ");
        String titulo = sc.nextLine();
        System.out.print("Informe a duracao do filme: ");
        String duracao = sc.nextLine();
        System.out.print("Informe a classificacao: ");
        int classificacao = sc.nextInt();
        sc.nextLine();

        LocalTime duracaoFormatada = LocalTime.parse(duracao,formatoHora);

        Filme filme = new Filme(titulo,duracaoFormatada,classificacao);
        filmes.add(filme);

        System.out.println("O filme " + titulo +  " foi adicionado.");
    }

    /*Funcao 6 */
    public static void listarFilmes(){
        for (int i = 0;i<filmes.size();i++){
            Filme filmeAtual = filmes.get(i);
            System.out.println(filmeAtual.toString());
        }
    }

    /*Funcao 7 */
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

        boolean encontrada = false;

        for (int i =0;i<sessoes.size();i++){
            Sessao sessaoAtual = sessoes.get(i);
            if (sessaoAtual.equals(novaSessao)){
                encontrada = true;
                if (sessaoAtual.getIngressos() > 0){
                    sessaoAtual.setIngresso(sessaoAtual.getIngressos() - 1);
                }
                else{
                    System.out.println("Nao tem ingressos disponiveis.");
                }
                return;
            }
           
        }

        if(!encontrada){
            System.out.println("Sessao nao foi encontrada.");
            return;
        }
        
    }

    public static void fim(){
        System.out.println("Saindo...");
    }
}