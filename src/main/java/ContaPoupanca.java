public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 2000000;

    public ContaPoupanca(Cliente cliente){
        super.agencia = AGENCIA;
        super.numConta = SEQUENCIAL++;
        super.cliente = cliente;
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO DA CONTA POUPANÇA ===");
        super.imprimirInfosComuns();
    }
}