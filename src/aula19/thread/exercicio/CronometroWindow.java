package aula19.thread.exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CronometroWindow extends JFrame {

	private JPanel contentPane;
	private JLabel lblContador;
	private JButton btnIniciar;
	private JButton btnReiniciar;
	private JButton btnParar;

	private CronometroThread cronometroThread;
	private int contador;

	public CronometroWindow() {

		this.initComponents();
		this.iniciarBotoes();
		this.contador = 0;
	}

	private void iniciarBotoes() {

		this.btnReiniciar.setEnabled(false);
		this.btnParar.setEnabled(false);
	}

	private void iniciarContagem() {

		this.cronometroThread = new CronometroThread(this);
		this.cronometroThread.start();
		
		this.btnIniciar.setEnabled(false);
		this.btnReiniciar.setEnabled(true);
		this.btnParar.setEnabled(true);
	}

	private void reiniciarContagem() {

		this.contador = 0;
		this.lblContador.setText(String.valueOf(this.contador));
	}
	
	private void pararContagem() {
		
		this.cronometroThread.interrupt();
		
		this.btnIniciar.setEnabled(true);
        this.btnParar.setEnabled(false);
	}

	private void initComponents() {

		setTitle("Cronômetro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblContador = new JLabel("0");
		lblContador.setHorizontalAlignment(SwingConstants.CENTER);
		lblContador.setFont(new Font("Tahoma", Font.BOLD, 72));
		lblContador.setBounds(189, 88, 169, 107);
		contentPane.add(lblContador);

		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				iniciarContagem();
			}
		});
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIniciar.setBounds(10, 287, 169, 52);
		contentPane.add(btnIniciar);

		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				reiniciarContagem();
			}
		});
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReiniciar.setBounds(189, 287, 169, 52);
		contentPane.add(btnReiniciar);

		btnParar = new JButton("Parar");
		btnParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pararContagem();
			}
		});
		btnParar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnParar.setBounds(368, 287, 169, 52);
		contentPane.add(btnParar);

		this.setLocationRelativeTo(null);
	}
	
	public JLabel getLblContador() {
		
		return lblContador;
	}
	
	public int getContador() {
		
		return contador;
	}
	
	public void setContador(int contador) {
		
		this.contador = contador;
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CronometroWindow frame = new CronometroWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
