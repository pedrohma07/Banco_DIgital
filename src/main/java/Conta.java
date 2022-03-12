import lombok.Getter;

import java.sql.SQLOutput;

@Getter
public abstract class Conta implements Iconta{
    protected static final int AGENCIA = 1;

    protected int numConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    protected double ultimaTransacao;

    @Override
    public void sacar(double valor){
        if(this.saldo > valor){
            this.saldo = this.saldo - valor;
            this.ultimaTransacao = -valor;
        }
        else{
            System.out.println("Valor invalido!");
        }
    }
    @Override
    public void depositar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
            this.ultimaTransacao = valor;
        }
        else{
            System.out.println("Valor invalido!");
        }
    }
    @Override
    public void tranferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println("Titular: "+this.cliente.getIdentificacao());
        System.out.println("Agencia: "+getAgencia());
        System.out.println("Conta: "+getNumConta());
        System.out.printf("Saldo: %.2f \n", getSaldo());
        System.out.println("======== Ultima Transação ========");
        System.out.println("R$ ------------------------ "+this.ultimaTransacao);
    }
}