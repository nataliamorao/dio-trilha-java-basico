public class ContaCorrente extends Conta {
  private double limite;

  public ContaCorrente(String numero, double saldo, Cliente cliente, double limite) {
      super(numero, saldo, cliente);
      this.limite = limite;
  }

  public double getLimite() {
      return limite;
  }

  @Override
  public void sacar(double valor) {
      if (getSaldo() + this.limite >= valor) {
          // Implementação do saque considerando o limite
          double novoSaldo = getSaldo() - valor;
          if (novoSaldo < 0) {
              this.limite += novoSaldo; // Usa parte do limite
          }
          setSaldo(novoSaldo);
          System.out.println("Saque de R$" + valor + " realizado na conta corrente " + getNumero());
      } else {
          System.out.println("Saldo e limite insuficientes na conta corrente " + getNumero());
      }
  }

  @Override
  public String toString() {
      return "ContaCorrente{" +
              "numero='" + getNumero() + '\'' +
              ", saldo=" + getSaldo() +
              ", cliente=" + getCliente().getNome() +
              ", limite=" + limite +
              '}';
  }
}