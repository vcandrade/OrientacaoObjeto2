package aula18.manipulacaoarquivos.seletorarquivos;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AbrirArquivo {

	public static void main(String[] args) {

		JFileChooser seletor = new JFileChooser();
		
		FileNameExtensionFilter filtroTxt = new FileNameExtensionFilter("Documento de texto (*.txt)", "txt");
		FileNameExtensionFilter filtroDoc = new FileNameExtensionFilter("Documento do Word (*.docx)", "docx");
		FileNameExtensionFilter filtroPdf = new FileNameExtensionFilter("Documento PDF (*.pdf)", "pdf");
		
		seletor.setFileFilter(filtroTxt);
		seletor.setFileFilter(filtroDoc);
		seletor.setFileFilter(filtroPdf);
		
		int valorRetorno = seletor.showOpenDialog(null);

		if (valorRetorno == JFileChooser.APPROVE_OPTION) {

			System.out.println("Nome do arquivo selecionado: " + seletor.getSelectedFile().getName());
			System.out.println("Diretório do arquivo selecionado: " + seletor.getSelectedFile().getAbsolutePath());
		}
	}
}
