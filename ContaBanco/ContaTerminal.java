package ContaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

   public static void main(String[] args) {

       // Criando um Scanner para ler as entradas do usuário

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       // Solicitando os dados do cliente

       System.out.print("Digite o número da conta: ");

       int numeroConta = scanner.nextInt();

       
       System.out.print("Digite a agência: ");

       String agencia = scanner.next();

    
       System.out.print("Digite o seu nome : ");

       String nomeCliente = scanner.next();

       
       System.out.print("Digite o saldo inicial: ");

       double saldo = scanner.nextDouble();

       
       // Fechando o Scanner

       scanner.close();

       
       // Exibindo a mensagem de boas-vindas com os dados do cliente

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");

       System.out.println("sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

       
       System.out.println("\n Informações do cliente");
       System.out.println("-----------------------------------------");
       System.out.println("Nome: " + nomeCliente);
       System.out.println("Numero da conta: " + numeroConta);
       System.out.println("Agência: " + agencia);
       System.out.println("Saldo da conta: " + saldo);
       System.out.println("-----------------------------------------");

   }

}