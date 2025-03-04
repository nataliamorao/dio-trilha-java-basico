public class Tabuada {
  private int numero;

  public Tabuada(int numero) {
    this.numero = numero;
  }

  public void imprimirTabuada() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }
  
}
