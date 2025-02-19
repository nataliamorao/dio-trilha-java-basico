// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class ClienteBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o saldo do cliente:");
        double saldo = scanner.nextDouble();
        String classificacaoCliente;

        // TODO: Implemente a classificação do cliente com base no saldo:
        if (saldo < 0.00) {
        classificacaoCliente = "Negativado";
        } else if (saldo > 0.00 && saldo <= 500.00) {
          classificacaoCliente = "Baixo";
          } else {
            classificacaoCliente = "Confortavel";
          }
          
        System.out.printf("A classificação do cliente é: " + classificacaoCliente);
        
        scanner.close();
    }
} 