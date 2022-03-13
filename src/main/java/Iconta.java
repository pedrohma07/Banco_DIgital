public interface Iconta {
    void sacar(double valor);
    void depositar(double valor);
    void tranferir(Conta contaDestino, double valor);

    void imprimirDadosConta();
    void extratoConta();
}
