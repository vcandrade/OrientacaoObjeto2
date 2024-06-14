package aula19.thread.exemplo04;

public class ExemploThread extends Thread {

	private String usuario;
	private String [] docs;
	private static Impressora impressora;

	public ExemploThread(String usuario, String [] docs) {

		this.usuario = usuario;
		this.docs = docs;
		this.impressora = new Impressora();
	}

	@Override
	public void run() {
		
		impressora.imprimir(usuario, docs);		
	}
}
