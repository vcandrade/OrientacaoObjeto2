package aula17.caixadialogo.customizada;

import javax.swing.JOptionPane;

public class ExemploCaixaDialogo {

	public static void main(String[] args) {

		String[] options = { "Opção 1", "Opção 2", "Cancelar" };

		int option = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Caixa de Diálogo Personalizada", 
				                                  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

		if (option == 0) {
			
			System.out.println("Opção 1 selecionada");
		
		} else if (option == 1) {
			
			System.out.println("Opção 2 selecionada");
		
		} else if (option == 2) {
			
			System.out.println("Operação cancelada");
		
		} else {
			
			System.out.println("Nenhuma opção selecionada");
		}
	}
}
