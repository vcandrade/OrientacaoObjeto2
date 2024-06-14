package aula17.caixadialogo.entradadados;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Informe seu noem:", null, JOptionPane.QUESTION_MESSAGE);
		System.out.println("Nome: " + nome);
	}
}
