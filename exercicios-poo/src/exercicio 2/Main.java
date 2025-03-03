package exercicio 2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        Quadrado quadrado = new Quadrado(lado);
        quadrado.exibirArea();

        scanner.close();
    }
}