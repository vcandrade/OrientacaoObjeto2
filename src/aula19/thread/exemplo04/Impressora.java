package aula19.thread.exemplo04;

public class Impressora {

	public synchronized void imprimir(String usuario, String[] docs) {

		try {
			
			System.out.println("Usuário: " + usuario + ". Iniciando Impressão");
			
			for (int i = 0; i < docs.length; i++) {

				System.out.println("Imprimindo documento: " + docs[i]);
				Thread.sleep(500);
			}

			System.out.println("Usuário: " + usuario + ". Impressão Finalizada");
		
		} catch (InterruptedException e) {
			
			System.out.println("Erro: " + e.getMessage());
		
		}
	}
}
