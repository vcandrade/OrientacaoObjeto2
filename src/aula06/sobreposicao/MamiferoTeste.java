package aula06.sobreposicao;

import java.util.Scanner;

public class MamiferoTeste {

	public static void main(String[] args) {

		Clinica clinica = new Clinica("123456", "New Cl�nica");
		
		clinica.cadastrar(new Gato("Alfredo", "Si�mes"));
		clinica.cadastrar(new Cachorro("Spike", "Pastor Alem�o"));
		clinica.cadastrar(new Cavalo("Atlas", "Bret�o"));
		
		clinica.listarAnimais();
	}
}
