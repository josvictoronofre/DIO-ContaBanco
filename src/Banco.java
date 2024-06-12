import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    String nome;

    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
