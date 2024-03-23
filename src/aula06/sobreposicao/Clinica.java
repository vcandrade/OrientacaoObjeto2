package aula06.sobreposicao;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

	private String cnpj;
	private String razaoSocial;

	private List<Mamifero> listaMamiferos;

	public Clinica(String cnpj, String razaoSocial) {

		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.listaMamiferos = new ArrayList<Mamifero>();
	}

	public void cadastrar(Mamifero mamifero) {

		this.listaMamiferos.add(mamifero);
		System.out.println(mamifero.getNome() + " cadastrado com sucesso.");
	}

	public void listarAnimais() {

		System.out.println("========= LISTA DE MAMÍFEROS =========");
		System.out.println("Empresa: " + this.razaoSocial);
		System.out.println("CNPJ: " + this.cnpj);

		for (Mamifero mamifero : listaMamiferos) {

			System.out.println("Nome: " + mamifero.getNome() + "\t Raça: " + mamifero.getRaca());
		}

		System.out.println("======================================");
	}
}
