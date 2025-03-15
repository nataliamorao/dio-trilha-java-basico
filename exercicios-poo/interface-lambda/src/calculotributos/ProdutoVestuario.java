package calculotributos;

class ProdutoVestuario implements Tributavel {
  @Override
  public double calcularTributo(double valor) {
      return valor * 0.025; // 2.5%
  }
}
