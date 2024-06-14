package aula18.manipulacaoarquivos.seletorarquivos;

import javax.swing.JFileChooser;

public class SalvarArquivo {

	public static void main(String[] args) {
		
		JFileChooser seletor = new JFileChooser();
		int valorRetorno = seletor.showSaveDialog(null);
	}
}
