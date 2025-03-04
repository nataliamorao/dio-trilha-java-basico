import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Código para calcular a Tabuada
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        Tabuada tabuada = new Tabuada(numero);
        tabuada.imprimirTabuada();

        scanner.close();
        */

        // Código para calcular o IMC

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(peso, altura);
        String classificacao = pessoa.classificarImc();

        System.out.println("Classificação do IMC: " + classificacao);

        scanner.close();
    }
}