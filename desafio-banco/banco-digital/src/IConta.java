public interface IConta {
    String getNumero();

    double getSaldo();

    void depositar(double valor);

    void sacar(double valor);

    void transferir(IConta contaDestino, double valor);

    String extrato();

}
