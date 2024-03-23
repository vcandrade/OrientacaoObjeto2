package aula06.sobreposicao;

public abstract class Mamifero {

	protected String nome;
	protected String raca;

	public Mamifero(String nome, String raca) {

		this.nome = nome;
		this.raca = raca;
	}

	public abstract void emitirSom();
	
	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
}
