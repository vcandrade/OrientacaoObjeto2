package aula19.thread.exemplo03;

public class ExemploThreadTeste {

	public static void main(String[] args) throws InterruptedException {

		ExemploThread exemploThread1 = new ExemploThread("Thread 1", 400);
		ExemploThread exemploThread2 = new ExemploThread("Thread 2", 600);
		ExemploThread exemploThread3 = new ExemploThread("Thread 3", 900);

		exemploThread1.start();
		exemploThread2.start();
		exemploThread3.start();

		exemploThread1.join();
		exemploThread2.join();
		exemploThread3.join();

		System.out.println("Continuando a execução do processo após as threads serem finalizadas.");
	}
}
