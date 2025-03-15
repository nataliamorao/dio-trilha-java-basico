import java.util.Scanner;

public class DivisaoResto {

    private int numeroInicial;

    public DivisaoResto(int numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    public void processarNumeros() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número ignorado: menor que o número inicial.");
                continue;
            }

            if (numero % numeroInicial != 0) {
                System.out.println("Fim da execução: resto da divisão diferente de 0.");
                break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número inicial: ");
        int numeroInicial = scanner.nextInt();

        DivisaoResto divisaoResto = new DivisaoResto(numeroInicial);
        divisaoResto.processarNumeros();

        scanner.close();
    }
}