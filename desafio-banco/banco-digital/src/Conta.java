public class Conta {
  private String numero;
  private double saldo;
  private Cliente cliente;

  public Conta(String numero, double saldo, Cliente cliente) {
      this.numero = numero;
      this.saldo = saldo;
      this.cliente = cliente;
  }

  public void setSaldo(double novoSaldo) {
    this.saldo = novoSaldo;
  }

  public String getNumero() {
      return numero;
  }

  public double getSaldo() {
      return saldo;
  }

  public Cliente getCliente() {
      return cliente;
  }

  public void depositar(double valor) {
      this.saldo += valor;
      System.out.println("Depósito de R$" + valor + " realizado na conta " + this.numero);
  }

  public void sacar(double valor) {
      if (this.saldo >= valor) {
          this.saldo -= valor;
          System.out.println("Saque de R$" + valor + " realizado na conta " + this.numero);
      } else {
          System.out.println("Saldo insuficiente na conta " + this.numero);
      }
  }

  public void transferir(double valor, Conta destino) {
      if (this.saldo >= valor) {
          this.saldo -= valor;
          destino.depositar(valor);
          System.out.println("Transferência de R$" + valor + " da conta " + this.numero + " para a conta " + destino.getNumero() + " realizada.");
      } else {
          System.out.println("Saldo insuficiente na conta " + this.numero + " para realizar a transferência.");
      }
  }

  public void extrato() {
      System.out.println("--- Extrato da Conta " + this.numero + " ---");
      System.out.println("Cliente: " + this.cliente.getNome());
      System.out.println("Saldo: R$" + this.saldo);
      System.out.println("------------------------------------");
  }

  @Override
  public String toString() {
      return "Conta{" +
              "numero='" + numero + '\'' +
              ", saldo=" + saldo +
              ", cliente=" + cliente.getNome() +
              '}';
  }
}
