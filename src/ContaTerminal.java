import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);        

        System.out.println("Por favor, digite o número da Agência!");
        System.out.print("Nº Agência: ");
        int numeroConta = consistirInteiro(sc);
        
        System.out.println("\nPor favor, digite o nome da Agência!");
        System.out.print("Nome da Agência: ");
        String nomeAgencia = sc.nextLine();

        System.out.println("\nPor favor, digite o nome do cliente!");
        System.out.print("Nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("\nPor favor, digite o saldo desta conta!");
        System.out.print("Saldo: ");
        double saldo = consistirDouble(sc);

        System.out.printf(
            "\nOlá %s, obrigado por criar uma conta em nosso banco sua agência é %s, "+
            "conta %d, e seu saldo R$ %.2f já está disponível para saque.",
            nomeCliente, nomeAgencia, numeroConta, saldo
        );

        sc.close();
    }
        
    public static int consistirInteiro(Scanner sc){
        do {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.print("Insira um número válido: ");
            }
        }
        while (true);
    }
    
    public static double consistirDouble(Scanner sc){
        do {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.print("Insira um número válido: ");
            }
        }
        while (true);
    }

}
