public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00", "Rua B, 456");

        // Criando contas
        Conta conta1 = new ContaCorrente("001", 1000.0, cliente1, 500.0);
        Conta conta2 = new ContaPoupanca("002", 2000.0, cliente2, 0.05);

        // Exibindo informações das contas
        System.out.println(conta1);
        System.out.println(conta2);

        // Realizando operações
        conta1.depositar(200);
        conta1.sacar(150);
        conta1.transferir(300, conta2);

        System.out.println("Extrato da conta 1:");
        conta1.extrato(); 
        
        System.out.println("\nExtrato da conta 2:");
        conta2.extrato();
    }
}

