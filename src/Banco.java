import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		if(contas == null) {
			contas = new ArrayList<Conta>();
		}
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void imprimirClientes() {
		System.out.println("=== Lista de clientes do Banco ===");
		getContas().stream().map(conta -> conta.getCliente().getNome()).distinct().forEach(nomeCliente -> System.out.println(nomeCliente) );
	}

}