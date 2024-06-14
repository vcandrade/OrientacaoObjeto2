package aula19.thread.exemplo01;

public class ExemploThreadTeste {

	public static void main(String[] args) {

		ExemploThread exemploThread1 = new ExemploThread("Thread 1", 400);
		ExemploThread exemploThread2 = new ExemploThread("Thread 2", 900);

		exemploThread1.start();
		exemploThread2.start();
	}
}
