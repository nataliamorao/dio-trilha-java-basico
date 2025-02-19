// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        System.out.println("Digite o valor da primeira transação:");
        double transacaoUm = scanner.nextDouble();
        System.out.println("Digite o valor da segunda transação:");
        double transacaoDois = scanner.nextDouble();
        System.out.println("Digite o valor da terceira transação:");
        double transacaoTres = scanner.nextDouble();

        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial + transacaoUm + transacaoDois + transacaoTres;
        
        // Saldo final  
        System.out.printf("Saldo final: %.2f", saldoFinal);

        scanner.close();
    }
}