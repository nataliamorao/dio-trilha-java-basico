package calculotributos;

class ProdutoSaudeBemEstar implements Tributavel {
  @Override
  public double calcularTributo(double valor) {
      return valor * 0.015; // 1.5%
  }
}
