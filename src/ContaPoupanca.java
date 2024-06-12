public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void printConta() {
        System.out.println("Conta poupanca");
        super.printInformacoes();
    }

}