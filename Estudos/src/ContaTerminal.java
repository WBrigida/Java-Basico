import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Ola, por favor digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agora o numero da sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Agora digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Agora digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + " ,conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
