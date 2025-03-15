package calculotributos;

public class CalculadoraTributos {
  public double calcularTributo(Tributavel produto, double valor) {
      return produto.calcularTributo(valor);
  }
}
