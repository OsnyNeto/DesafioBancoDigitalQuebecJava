public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void trasferir(double valor, Conta ContaDestino);

    void imprimirExtrato();

    void contratarEmprestimo(double valor, Conta ContaDestino);
}
