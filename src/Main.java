import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Cliente mauricio = new Cliente();
		mauricio.setNome("Mauricio");
		
		Conta contaCorrente = new ContaCorrente(mauricio);
		Conta poupanca = new ContaPoupanca(mauricio);

		contaCorrente.depositar(100);
		contaCorrente.transferir(100, poupanca);
		
		contaCorrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Banco banco = new Banco();
		banco.setContas(Arrays.asList(contaCorrente, poupanca));
		banco.imprimirClientes();
	}

}
