package aula17.caixadialogo.confirmacao;

import javax.swing.JOptionPane;

public class Confirmacao {

	public static void main(String[] args) {
		
		int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja confirmar?", "Confirma��o", JOptionPane.YES_NO_OPTION);
		System.out.println("Confirma��o: " + confirmacao);
	}
}
