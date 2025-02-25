public class AreaQuadrado {
    private double lado;

    public AreaQuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public void exibirMensagem() {
        double area = calcularArea();
        System.out.println("A área do quadrado é " + area);
    }
  
}
