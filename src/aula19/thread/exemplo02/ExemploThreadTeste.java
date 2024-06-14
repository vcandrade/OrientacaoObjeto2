package aula19.thread.exemplo02;

public class ExemploThreadTeste {

	public static void main(String[] args) {

		ExemploThread exemploThread1 = new ExemploThread("Thread 1", 400);
		Thread thread1 = new Thread(exemploThread1);
		
		ExemploThread exemploThread2 = new ExemploThread("Thread 2", 900);
		Thread thread2 = new Thread(exemploThread2);

		thread1.start();
		thread2.start();
	}
}
