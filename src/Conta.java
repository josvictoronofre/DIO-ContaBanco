public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;

    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double quantidade) {
        if (quantidade <= saldo) {
            saldo -= quantidade;
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double quantidade) {
        saldo += quantidade;
    }

    @Override
    public void transferir(double quantidade, Conta contaDestino) {
        this.sacar(quantidade);
        contaDestino.depositar(quantidade);
    }

    public void printInformacoes() {
        System.out.println("Agencia: " + agencia);
        System.out.println("numero: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }
    
}
