public interface IConta {

    void sacar(double quantidade);
    void depositar(double quantidade);
    void transferir(double quantidade, Conta contaDestino);
}
