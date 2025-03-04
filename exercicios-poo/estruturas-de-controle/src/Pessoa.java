public class Pessoa {
  private double peso;
  private double altura;

  public Pessoa(double peso, double altura) {
      this.peso = peso;
      this.altura = altura;
  }

  public double calcularImc() {
      return peso / (altura * altura);
  }

  public String classificarImc() {
      double imc = calcularImc();
      if (imc <= 18.5) {
          return "Abaixo do peso";
      } else if (imc <= 24.9) {
          return "Peso ideal";
      } else if (imc <= 29.9) {
          return "Levemente acima do peso";
      } else if (imc <= 34.9) {
          return "Obesidade Grau I";
      } else if (imc <= 39.9) {
          return "Obesidade Grau II (Severa)";
      } else {
          return "Obesidade III (Mórbida)";
      }
  }
}