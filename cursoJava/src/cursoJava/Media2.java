package cursoJava;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double n1, n2;
		System.out.print("Primeira nota: ");
		n1 = teclado.nextDouble();
		System.out.print("Segunda nota: ");
		n2 = teclado.nextDouble();
		teclado.close();
		
		double media = (n1 + n2) / 2;
		System.out.println("A media eh " + media);
		
		if (media >= 9) {
			System.out.println("Parabens");
		}
		
	}

}
