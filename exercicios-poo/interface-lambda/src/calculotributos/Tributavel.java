package calculotributos;

@FunctionalInterface
interface Tributavel {
    double calcularTributo(double valor);
}