public class ContaCorrente extends Conta{
    private static int SEQUENCIAL = 1000000;

    public ContaCorrente(Cliente cliente){
        super.agencia = AGENCIA;
        super.numConta = SEQUENCIAL++;
        super.cliente = cliente;
    }
    @Override
    public void imprimirExtrato() {
        System.out.println( "=== EXTRATO DA CONTA CORRENTE ===");
        super.imprimirInfosComuns();
    }
}