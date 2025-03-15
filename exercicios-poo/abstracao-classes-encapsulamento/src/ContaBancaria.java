import java.util.Scanner;

public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    private double limiteChequeEspecial;
    private boolean usandoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
        this.limiteChequeEspecial = this.saldo + this.chequeEspecial;
        this.usandoChequeEspecial = false;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Limite de cheque especial: R$" + chequeEspecial);
    }

    public void depositar(double valor) {
        if (usandoChequeEspecial) {
            double valorDevido = limiteChequeEspecial - saldo;
            if (valor >= valorDevido) {
                saldo = valor - valorDevido;
                chequeEspecial = limiteChequeEspecial - saldo;
                usandoChequeEspecial = false;
                System.out.println("Depósito realizado. Cheque especial regularizado.");
            } else {
                saldo += valor;
                chequeEspecial -= valor;
                System.out.println("Depósito realizado. Cheque especial parcialmente regularizado.");
            }
        } else {
            saldo += valor;
            System.out.println("Depósito realizado.");
        }
    }

    public void sacar(double valor) {
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
            if (saldo < 0) {
                usandoChequeEspecial = true;
            }
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void pagarBoleto(double valor) {
        sacar(valor);
    }

    public void verificarChequeEspecial() {
        if (usandoChequeEspecial) {
            System.out.println("Conta utilizando cheque especial.");
            double taxa = (limiteChequeEspecial - saldo) * 0.2;
            System.out.println("Taxa de 20% sobre o valor utilizado: R$" + taxa);
        } else {
            System.out.println("Conta não está utilizando cheque especial.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o depósito inicial: R$");
        double depositoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Digite o valor do depósito: R$");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.print("Digite o valor do saque: R$");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: R$");
                    double valorBoleto = scanner.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    conta.verificarChequeEspecial();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}