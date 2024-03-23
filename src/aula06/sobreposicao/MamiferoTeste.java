package aula06.sobreposicao;

import java.util.Scanner;

public class MamiferoTeste {

	public static void main(String[] args) {

		Clinica clinica = new Clinica("123456", "New Clínica");
		
		clinica.cadastrar(new Gato("Alfredo", "Siâmes"));
		clinica.cadastrar(new Cachorro("Spike", "Pastor Alemão"));
		clinica.cadastrar(new Cavalo("Atlas", "Bretão"));
		
		clinica.listarAnimais();
	}
}
