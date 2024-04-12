package aula07.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.print("Informe o numerador: ");
			int numerador = input.nextInt();

			System.out.print("Informe o denominador: ");
			int denominador = input.nextInt();

			int resultado = numerador / denominador;
			System.out.println("Resultado: " + resultado);

		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por 0");
			System.out.println(ae.getMessage());

		} catch (InputMismatchException ime) {

			System.out.println("Informe apenas valores inteiros");
			System.out.println(ime.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			input.close();
			System.out.println("executando o bloco finally");
		}
	}
}
