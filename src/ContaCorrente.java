import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

	private List<CartaoCredito> cartoes;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public List<CartaoCredito> getCartoes() {
		if (cartoes == null) {
			cartoes = new ArrayList<CartaoCredito>();
		}
		return cartoes;
	}

	public void setCartoes(List<CartaoCredito> cartoes) {
		this.cartoes = cartoes;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

}