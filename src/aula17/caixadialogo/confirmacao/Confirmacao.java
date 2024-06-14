package aula17.caixadialogo.confirmacao;

import javax.swing.JOptionPane;

public class Confirmacao {

	public static void main(String[] args) {
		
		int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja confirmar?", "Confirmação", JOptionPane.YES_NO_OPTION);
		System.out.println("Confirmação: " + confirmacao);
	}
}
