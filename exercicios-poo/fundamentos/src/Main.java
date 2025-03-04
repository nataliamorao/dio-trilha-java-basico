import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Código do exercício anterior (nome e idade)
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano de nascimento da pessoa: ");
        int anoNascimento = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, anoNascimento);
        int idade = pessoa.calcularIdade();

        System.out.println("Olá " + pessoa.getNome() + ", você tem " + idade + " anos.");

        scanner.close();
        */

        // Código para o exercício do quadrado
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        Quadrado quadrado = new Quadrado(lado);
        double area = quadrado.calcularArea();

        System.out.println("A área do quadrado é: " + area);

        scanner.close(); 
         */
        
        // Código para o exercício do retângulo
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        
        System.out.println("A área do retângulo é: " + new Retangulo(base, altura).calcularArea());
    */
    
    // Código para o exercício da diferença de idade
    Scanner scanner = new Scanner(System.in);

        // Dados da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        // Dados da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        // Criar objetos Pessoa
        Pessoa pessoa1 = new Pessoa(nome1, idade1);
        Pessoa pessoa2 = new Pessoa(nome2, idade2);

        // Calcular a diferença de idade
        int diferencaIdade = Math.abs(pessoa1.getIdade() - pessoa2.getIdade());

        // Exibir a diferença de idade
        System.out.println("A diferença de idade entre " + pessoa1.getNome() + " e " + pessoa2.getNome() + " é de " + diferencaIdade + " anos.");

        scanner.close();
    }
}