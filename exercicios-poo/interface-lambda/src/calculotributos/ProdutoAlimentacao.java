package calculotributos;

class ProdutoAlimentacao implements Tributavel {
  @Override
  public double calcularTributo(double valor) {
      return valor * 0.01; // 1%
  }
}
