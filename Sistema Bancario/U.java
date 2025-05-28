public class U {
    public static void main(String[] args){

        ContaBancaria conta1 = new ContaBancaria(123,"joao",20);

        conta1.depositar(20);
        System.out.println(conta1.consultarSaldo());
        conta1.sacar(20);
        System.out.println(conta1.consultarSaldo());
    }
}