import java.util.Scanner;

public class NumerosParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obter os números do usuário
        int primeiroNumero, segundoNumero;
        do {
            System.out.print("Digite o primeiro número: ");
            primeiroNumero = scanner.nextInt();
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            segundoNumero = scanner.nextInt();

            if (segundoNumero <= primeiroNumero) {
                System.out.println("O segundo número deve ser maior que o primeiro. Tente novamente.");
            }
        } while (segundoNumero <= primeiroNumero);

        // Obter a opção do usuário
        String opcao;
        do {
            System.out.print("Escolha (par/impar): ");
            opcao = scanner.next().toLowerCase();
            if (!opcao.equals("par") && !opcao.equals("impar")) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcao.equals("par") && !opcao.equals("impar"));

        // Exibir os números pares ou ímpares em ordem decrescente
        System.out.println("Números " + opcao + " no intervalo [" + primeiroNumero + ", " + segundoNumero + "]:");

        if (opcao.equals("par")) {
            for (int i = segundoNumero; i >= primeiroNumero; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = segundoNumero; i >= primeiroNumero; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println(); // Nova linha no final
        scanner.close();
    }
}