package aula07.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		try {

			calc.dividir();
			calc.calcularRaizQuadrada(-9);

		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por 0");

		} catch (InputMismatchException ime) {

			System.out.println("Informe apenas valores inteiros");

		} catch (NumeroNaoNaturalException nnne) {

			System.out.println(nnne.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
