package aula05.heranca;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor("Jo�o da Silva", 30, "Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR", 5000.00, 2000.00);
		professor1.imprimirDados();
		
		Aluno aluno1 = new Aluno("Maria de Oliveira", 20, "Baldu�no Taques", 2048, "Centro", "Ponta Grossa", "PR");
		aluno1.realizarMatricula("Bacharelado em Ci�ncia da Computa��o");
		aluno1.imprimirDados();
	}
}
