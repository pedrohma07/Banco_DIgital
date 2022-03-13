public class ContaCorrente extends Conta{
    private static int SEQUENCIAL = 1000000;

    public ContaCorrente(Cliente cliente){
        super.agencia = AGENCIA;
        super.numConta = SEQUENCIAL++;
        super.cliente = cliente;
    }
    @Override
    public void imprimirDadosConta() {
        System.out.println( "=== DADOS DA CONTA CORRENTE ===");
        super.imprimirInfosComuns();
    }


}