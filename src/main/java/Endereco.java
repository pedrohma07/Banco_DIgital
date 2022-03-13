import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private TipoEndereco endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String estado;
    private String cep;

    public Endereco (TipoEndereco endereco, String numero, String complemento, String bairro, String estado, String cep){
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cep =  cep;
    }

    public static enum TipoEndereco{
        RESIDENCIAL,
        COMERCIAL
    }

    public void imprimirDadosEndereco(Endereco endereco){
        System.out.println("Tipo de endereço: "+getEndereco());
        System.out.println("Estado: "+getEstado());
        System.out.println("Numero: "+getNumero());
        System.out.println("Complemento: "+getComplemento());
        System.out.println("Cep: "+getCep());
    }
}
