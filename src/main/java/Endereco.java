import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Endereco {
    private TipoEndereco tpEndereco;
    private String rua;
    private String numero;
    private String bairro;
    private String estado;
    private String cidade;
    private String cep;
    private String complemento;

    public enum TipoEndereco{
        RESIDENCIAL,
        COMERCIAL
    }

    public void imprimirDadosEndereco(Endereco endereco){
        System.out.println("==============================");
        System.out.println("Tipo de endereço: "+getTpEndereco());
        System.out.println("Rua: "+getRua());
        System.out.println("Numero: "+getNumero());
        System.out.println("Bairro: "+getBairro());
        System.out.println("Cidade: "+getCidade());
        System.out.println("Estado: "+getEstado());
        System.out.println("Cep: "+getCep());
        System.out.println("Complemento: "+getComplemento());
        System.out.println("==============================");
    }

    public void cadastrarEndereco(){
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Tipo de endereço: ");
        System.out.println("1 para RESIDENCIAL\n2 para COMERCIAL");
        definindoEndereco(scInt.nextInt());
        System.out.print("Rua: ");
        this.rua = sc.nextLine();
        System.out.print("Numero: ");
        this.numero = sc.nextLine();
        System.out.print("Bairro: ");
        this.bairro = sc.nextLine();
        System.out.print("Cidade: ");
        this.cidade = sc.nextLine();
        System.out.print("Estado: ");
        this.estado = sc.nextLine();
        System.out.print("Cep: ");
        this.cep = sc.nextLine();
        System.out.print("Complemento: ");
        this.complemento = sc.nextLine();
        System.out.println("==============================");
    }

    public void definindoEndereco(int tpEndereco){
        int opc = tpEndereco;
        if(opc == 1){
            this.setTpEndereco(TipoEndereco.RESIDENCIAL);
        }
        else if(opc == 2){
            this.setTpEndereco(TipoEndereco.COMERCIAL);
        }
    }
}
