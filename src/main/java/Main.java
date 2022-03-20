import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        boolean fim = false;
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        Endereco edCliente = new Endereco();
        Cliente cliente = new Cliente(edCliente);
        cliente.cadastraCliente();
        edCliente.cadastrarEndereco();
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(2000);
        cc.tranferir(cp,500);
        System.out.println(cc.getSaldo());
        cc.extratoConta();

        System.out.println("----------");

        cp.extratoConta();

    }
}