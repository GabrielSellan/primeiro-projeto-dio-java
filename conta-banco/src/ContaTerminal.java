import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int num;
        double saldo;
        String agencia; 
        String nomeCliente;

        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        System.out.println("Por favor, digite o número da conta!");
        num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, informe o seu nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o saldo!");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
