import java.util.ArrayList;
import java.util.List;

public class Banco extends Conta {
    private String nome;
    private List<Conta> contasBanco = new ArrayList<Conta>();

    public Banco(Cliente cliente) {
        super(cliente);
    }

    public List<Conta> getContas() {
        return contasBanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimirExtrato() {

    }
}
