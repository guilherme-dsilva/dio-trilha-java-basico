import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitando os dados para o usuário
        System.out.println("Seja bem vindo, coloque os dados solicitados abaixo para criar a sua conta bancaria");

        System.out.println("Por favor, digite o número da sua Agência: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, agora digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Informe seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o valor do saldo: ");
        double saldo = scanner.nextDouble();

        //Imprimindo os dados passados pelo usuario no Terminal
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo no valor de " + saldo + "$ já está disponível para saque");


    }
}
