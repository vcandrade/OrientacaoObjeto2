package aula19.thread.exemplo02;

public class ExemploThread implements Runnable {

	private String nome;
	private int tempo;

	public ExemploThread(String nome, int tempo) {

		this.nome = nome;
		this.tempo = tempo;
	}

	@Override
	public void run() {

		try {
			
			for (int i = 0; i < 10; i++) {

				System.out.println(this.nome + ": contador: " + i);
				Thread.sleep(tempo);
			}
		
		} catch (InterruptedException e) {
			
			System.out.println("Erro: " + e.getMessage());
		
		} finally {
			
			System.out.println(this.nome + " finalizada.");
		}
	}
}
