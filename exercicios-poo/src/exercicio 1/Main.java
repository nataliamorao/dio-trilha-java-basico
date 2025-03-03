package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, anoNascimento);
        pessoa.exibirMensagem();

        scanner.close();
    }
}