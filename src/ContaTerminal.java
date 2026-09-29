import java.util.Scanner;

public class ContaTerminal {
     private int numeroAgencia;
     private String agencia;
     private String nome_cliente;
     private double saldo;



    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o numero da Agência!");

        System.out.println(" Numero da Agência: ");
        Integer in_numeroAgencia = scanner.nextInt();


        System.out.println("Por favor, digite sua Agência!");
        System.out.println("Agência:");
        String in_agencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        System.out.println("Nome:");
        String in_nome = scanner.next();

        System.out.println("Por favor, informe seu saldo!");
        System.out.println("Saldo:");
        Double in_saldo = scanner.nextDouble();

        System.out.println("\n" + "Olá " + in_nome +", obrigado por criar uma conta em nosso banco, sua agência é " + in_agencia +", conta " + in_numeroAgencia +" e seu saldo " + in_agencia +" já está disponível para saque!");


    }
}
