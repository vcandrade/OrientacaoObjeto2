package aula16.eventos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PrincipalWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel lblResultado;

	public PrincipalWindow() {
		setTitle("Exemplo de Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigite = new JLabel("Digite:");
		lblDigite.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDigite.setBounds(63, 57, 64, 30);
		contentPane.add(lblDigite);
		
		txtTexto = new JTextField();
		txtTexto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				limparCampo();
			}
		});
		txtTexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTexto.setText("Digite aqui o texto...");
		txtTexto.setBounds(126, 57, 362, 30);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JButton btcCapturar = new JButton("Capturar");
		btcCapturar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				capturarTexto();
			}
		});
		btcCapturar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btcCapturar.setBounds(509, 57, 141, 30);
		contentPane.add(btcCapturar);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setBounds(126, 178, 362, 30);
		contentPane.add(lblResultado);
	}
	
	public void capturarTexto() {
		
		String texto = this.txtTexto.getText();
		this.lblResultado.setText(texto);
	}
	
	public void limparCampo() {
		
		this.txtTexto.setText("");
	}
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalWindow frame = new PrincipalWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
