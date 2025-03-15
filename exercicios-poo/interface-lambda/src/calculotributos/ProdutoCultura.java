package calculotributos;

class ProdutoCultura implements Tributavel {
  @Override
  public double calcularTributo(double valor) {
      return valor * 0.04; // 4%
  }
}
