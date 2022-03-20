import lombok.Getter;


@Getter
public abstract class Conta implements Iconta{
    protected static final int AGENCIA = 1;

    protected int numConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    protected double[] ultimasTransacoes = new double[5];

    @Override
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            ultimasTransacoes(-valor);
        }
        else{
            System.out.println("Valor invalido!");
        }
    }
    @Override
    public void depositar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
            ultimasTransacoes(valor);
        }
        else{
            System.out.println("Valor invalido!");
        }
    }
    @Override
    public void tranferir(Conta contaDestino, double valor){
        this.sacar(valor);
        if(valor <= this.saldo) {
            contaDestino.depositar(valor);
        }
    }

    protected void imprimirInfosComuns(){
        System.out.println("Titular: "+this.cliente.getIdentificacao());
        System.out.println("Agencia: "+getAgencia());
        System.out.println("Conta: "+getNumConta());
        System.out.printf("Saldo: %.2f \n", getSaldo());

    }
    public void ultimasTransacoes(double valor){
        for(int i = 4; i > 0; i--) {
            ultimasTransacoes[i] = ultimasTransacoes[i-1];
        }
        ultimasTransacoes[0] = valor;
    }
    public void extratoConta(){
        System.out.println("======== Ultima Transação ========");
        for (int i = 0; i < ultimasTransacoes.length; i++) {
            int count = String.valueOf(ultimasTransacoes[i]).length();
            if((String.valueOf(ultimasTransacoes[i]).charAt(count-2) != '0')  || String.valueOf(ultimasTransacoes[i]).charAt(count-1) != '0'){
                if(String.valueOf(ultimasTransacoes[i]).charAt(count-2) != '.')
                    count-=1;
            }
            System.out.print("R$ ");
            for (int j = 0; j < 30 - (count+1); j++) {
                System.out.print("-");
            }
            System.out.printf(" %.2f\n", ultimasTransacoes[i]);
        }
    }
}