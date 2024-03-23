package aula04.encapsulamento;

public class Conta {

	private int numeroConta;
	private double saldo;
	private String nomeTitular;

	public Conta(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}

	public void verificarSaldo() {

		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Nome do Titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("==================");
	}

	public void realizarSaque(double valor) {

		if (valor <= this.saldo) {

			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
		System.out.println("==================");
	}

	public void realizarDeposito(double valor) {

		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
	}

	public int getNumeroConta() {
		return numeroConta;
	}
}
