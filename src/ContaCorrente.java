public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void printConta() {
        System.out.println("Conta Corrente");
        super.printInformacoes();
    }

}
