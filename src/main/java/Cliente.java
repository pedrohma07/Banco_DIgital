import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Cliente {

    public static final int TAM_CPF = 11;
    public static final int TAM_CNPJ = 14;

    public enum TipoDocumento{
        CNPJ,
        CPF
    }
    @Setter
    private String identificacao;
    @Setter
    private String documento;
    @Setter
    private String dataNascimento;
    @Setter
    private String email;
    @Setter
    private String telefone;
    private TipoDocumento tipoDocumento;
    private List<Endereco> enderecos;
    

    public Cliente(String identificacao, String documento, String dataNascimento, String email, String telefone, Endereco enderecos){
        this.identificacao = identificacao;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        addEnderecos(enderecos);
        if(documento.length() == 11){
            this.tipoDocumento = TipoDocumento.CPF;
        }
        else if(documento.length() == 14){
            this.tipoDocumento = TipoDocumento.CNPJ;
        }
    }
    public void addEnderecos(Endereco enderecos){
        getEnderecos().add(enderecos);
    }

    public List<Endereco> getEnderecos() {
        if(this.enderecos == null){
            this.enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
    public void imprimirDadosCliente(Cliente cliente, Endereco endereco){
        System.out.println("Nome: "+getIdentificacao());
        System.out.println("Documento: ("+getTipoDocumento()+") "+getDocumento());
        System.out.println("Data de nascimento: "+getDataNascimento());
        System.out.println("E-mail: "+getEmail());
        System.out.println("Telefone: "+getTelefone());
        endereco.imprimirDadosEndereco(endereco);
    }
}
