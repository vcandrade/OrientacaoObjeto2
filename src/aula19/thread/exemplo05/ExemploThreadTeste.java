package aula19.thread.exemplo05;

public class ExemploThreadTeste {

	public static void main(String[] args) throws InterruptedException {

		ExemploThread exemploThread1 = new ExemploThread("Thread 1", 500);
		exemploThread1.setName("Thread 1");
		
		System.out.println(exemploThread1.currentThread().getName());
	}
}
