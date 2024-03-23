package aula04.encapsulamento;

public class ContaTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco("123456", "NewBank");

		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "José Carvalho");
		banco1.adicionarNovaConta(444, "Joaquim Ribeiro");

		banco1.verificarSaldoConta(333);

		banco1.realizarDepositoConta(333, 100.00);

		banco1.verificarSaldoConta(111);
		banco1.verificarSaldoConta(222);
		banco1.verificarSaldoConta(333);
		banco1.verificarSaldoConta(444);

		banco1.realizarSaqueConta(333, 75.00);

		banco1.verificarSaldoConta(111);
		banco1.verificarSaldoConta(222);
		banco1.verificarSaldoConta(333);
		banco1.verificarSaldoConta(444);

		banco1.removerConta(333);

		banco1.verificarSaldoConta(333);
	}
}
