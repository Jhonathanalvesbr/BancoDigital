import lombok.Data;

@Data
public class Cliente {

	private String nome;
	private Conta contaCorrente, contaPoupanca;
}
