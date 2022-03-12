public class Main{
    public static void main(String[] args){
        Endereco edPedro = new Endereco(Endereco.TipoEndereco.RESIDENCIAL,
                                        "135",
                                        "QD 58",
                                        "Santa Lúcia",
                                        "Alagoas",
                                        "57082168"
                                        );
        Cliente pedro = new Cliente( "Pedro Henrique",
                                    "12606810414",
                                    "07/06/2000",
                                    "pedrohma07@gmail.com",
                                    "(82) 98191-7864",
                                    edPedro);

        Conta cc = new ContaCorrente(pedro);
        Conta cp = new ContaPoupanca(pedro);


/*
        conta.depositar(1000);
        System.out.println(conta.getSaldo());
        conta.sacar(50);
        System.out.println(conta.getSaldo());
        conta.tranferir(conta2, 500);
        System.out.println(conta.getSaldo());
        System.out.println("-------");
        System.out.println(conta2.getSaldo());
        conta2.sacar(600);
        System.out.println(conta2.getSaldo());
        conta.imprimirExtrato();
        conta2.imprimirExtrato();*/
        pedro.imprimirDadosCliente(pedro, edPedro);
        System.out.println("------------------------------");
        cc.depositar(2500);
        cc.sacar(520);
        cc.imprimirExtrato();
    }
}