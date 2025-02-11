import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner (consumir a quebra de linha deixada pelo nextInt)

        System.out.println("Por favor, digite o seu Nome Completo!");
        String nomeCompleto = scanner.nextLine(); // Usar nextLine() para ler o nome completo

        System.out.println("Por favor, digite o seu Saldo!");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}