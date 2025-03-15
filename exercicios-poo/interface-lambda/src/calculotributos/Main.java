package calculotributos;

public class Main {
  public static void main(String[] args) {
      CalculadoraTributos calculadora = new CalculadoraTributos();

      Tributavel alimentacao = valor -> valor * 0.01;
      Tributavel saudeBemEstar = valor -> valor * 0.015;
      Tributavel vestuario = valor -> valor * 0.025;
      Tributavel cultura = valor -> valor * 0.04;

      double valorProduto = 100.0;

      double tributoAlimentacao = calculadora.calcularTributo(alimentacao, valorProduto);
      double tributoSaudeBemEstar = calculadora.calcularTributo(saudeBemEstar, valorProduto);
      double tributoVestuario = calculadora.calcularTributo(vestuario, valorProduto);
      double tributoCultura = calculadora.calcularTributo(cultura, valorProduto);

      System.out.println("Tributo Alimentação: R$" + tributoAlimentacao);
      System.out.println("Tributo Saúde e Bem-estar: R$" + tributoSaudeBemEstar);
      System.out.println("Tributo Vestuário: R$" + tributoVestuario);
      System.out.println("Tributo Cultura: R$" + tributoCultura);
  }
}
