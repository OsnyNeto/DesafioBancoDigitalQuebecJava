import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 001 ;
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor < saldo) {
            this.saldo -= valor;
        } else {

           this.saldo = getSaldo();
        }
    }
    @Override
    public void depositar(double valor) {

        this.saldo += valor;
    }

    @Override
    public void trasferir(double valor, Conta contaDestino) {
        this.saldo = getSaldo();
        if (valor < saldo) {
            sacar(valor);
            contaDestino.depositar(valor);
        }
    }
    @Override
    public void contratarEmprestimo(double valor, Conta contaDestino) {
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns() {

        System.out.println(String.format("Titular: %S", cliente.getNome()));
        System.out.println(String.format("Agência: %d",agencia));
        System.out.println(String.format("Número: %d",numero));
        System.out.println(String.format("Saldo: %.2f",saldo));
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


}
