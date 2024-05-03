import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero de sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite a sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu Saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +conta+ " e seu saldo R$"+saldo+ ", já está disponível para saque");

        scanner.close();
    }

}
