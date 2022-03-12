import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Banco {

    private List<Conta> contas;
    private String nome;

}
