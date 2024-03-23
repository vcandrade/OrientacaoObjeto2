package aula04.encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String cnpj;
	private String nome;

	private List<Conta> contasBancaria;

	public Banco(String cnpj, String nome) {

		this.cnpj = cnpj;
		this.nome = nome;
		this.contasBancaria = new ArrayList<Conta>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		Conta conta = new Conta(numeroConta, nomeTitular);
		this.contasBancaria.add(conta);

		System.out.println("Conta criada com sucesso.");
	}

	public void removerConta(int numeroConta) {

		for (Conta conta : contasBancaria) {

			if (numeroConta == conta.getNumeroConta()) {

				this.contasBancaria.remove(conta);
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void verificarSaldoConta(int numeroConta) {

		for (Conta conta : contasBancaria) {

			if (numeroConta == conta.getNumeroConta()) {

				conta.verificarSaldo();
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		for (Conta conta : contasBancaria) {

			if (numeroConta == conta.getNumeroConta()) {

				conta.realizarSaque(valor);
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void realizarDepositoConta(int numeroConta, double valor) {

		for (Conta conta : contasBancaria) {

			if (numeroConta == conta.getNumeroConta()) {

				conta.realizarDeposito(valor);
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}
}
