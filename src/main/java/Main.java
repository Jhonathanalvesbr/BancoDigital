public class Main {

	public static void main(String[] args) throws SaldoInsuficiente {
		Cliente jhonathan = new Cliente();
		jhonathan.setNome("Jhonathan");

		Cliente mylena = new Cliente();
		mylena.setNome("Mylena");

		jhonathan.setContaCorrente(new ContaCorrente(jhonathan));
		mylena.setContaPoupanca(new ContaPoupanca(mylena));

		jhonathan.getContaCorrente().depositar(1000);
		jhonathan.getContaCorrente().transferir(250,
				mylena.getContaPoupanca());
		
		jhonathan.getContaCorrente().imprimirExtrato();
		mylena.getContaPoupanca().imprimirExtrato();
	}

}
