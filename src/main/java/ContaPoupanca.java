public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 2000000;

    public ContaPoupanca(Cliente cliente){
        super.agencia = AGENCIA;
        super.numConta = SEQUENCIAL++;
        super.cliente = cliente;
    }

    public void imprimirDadosConta() {
        System.out.println("=== DADOS DA CONTA POUPANÇA ===");
        super.imprimirInfosComuns();
    }
}