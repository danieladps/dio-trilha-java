import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********** Bem - vindo ao Banco DIO **********");

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int numero = scanner.nextInt();

        float saldo = 500.20F;

        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}