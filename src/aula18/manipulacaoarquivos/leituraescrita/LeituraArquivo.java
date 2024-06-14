package aula18.manipulacaoarquivos.leituraescrita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader documento = new BufferedReader(new FileReader("D:\\Teste.txt"));
			
			String linha = documento.readLine();
			
			while (linha != null) {
				
				System.out.println(linha);
				
				linha = documento.readLine();
			}
			
			documento.close();
			
		} catch (IOException e) {
			
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
