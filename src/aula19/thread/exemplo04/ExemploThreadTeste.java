package aula19.thread.exemplo04;

public class ExemploThreadTeste {

	public static void main(String[] args) throws InterruptedException {

		String[] docs1 = { "Doc. 1", "Doc. 2", "Doc. 3", "Doc. 4" };
		String[] docs2 = { "Doc. A", "Doc. B", "Doc. C", "Doc. D" };

		ExemploThread usuario1 = new ExemploThread("João", docs1);
		ExemploThread usuario2 = new ExemploThread("Maria", docs2);

		usuario1.start();
		usuario2.start();
	}
}
