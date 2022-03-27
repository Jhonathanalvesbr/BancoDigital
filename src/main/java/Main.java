package com.mycompany.bancodigital;

public class Main {

	public static void main(String[] args) {
		Cliente jhonathan = new Cliente();
		jhonathan.setNome("Jhonathan");

		Cliente mylena = new Cliente();
		mylena.setNome("Mylena");
		
		Conta contaCorrente = new ContaCorrente(jhonathan);
		Conta contaPoupanca = new ContaPoupanca(mylena);

		contaCorrente.depositar(1000);
		contaCorrente.transferir(250, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
