public class ContaPoupanca extends Conta {
  private double taxaJuros;

  public ContaPoupanca(String numero, double saldo, Cliente cliente, double taxaJuros) {
      super(numero, saldo, cliente);
      this.taxaJuros = taxaJuros;
  }

  public double getTaxaJuros() {
      return taxaJuros;
  }

  public void aplicarJuros() {
      double juros = getSaldo() * this.taxaJuros;
      depositar(juros);
      System.out.println("Juros de R$" + juros + " aplicados na conta poupança " + getNumero());
  }

}