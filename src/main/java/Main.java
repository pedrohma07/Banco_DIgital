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

        do{

        }while(fim == true);
    }
}