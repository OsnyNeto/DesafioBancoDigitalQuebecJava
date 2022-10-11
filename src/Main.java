import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("osny");


        Conta cc = new ContaCorrente(cli);
        Conta cp = new ContaPoupanca(cli);

        cc.depositar(1000.55);

        cc.trasferir(10000, cp);
        cp.trasferir(500, cc);
        cc.contratarEmprestimo(1000, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}