package cursoJava;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ano de nascimento: ");
		int ano = teclado.nextInt();
		int idade = 2023 - ano;
		
		if (idade < 16) {
			System.out.println("Nao pode votar");
		} else if ((idade < 18) || (idade > 70)) {
			System.out.println("Voto opcional");
		} else {
			System.out.println("Voto obrigatorio");
		}
		
		teclado.close();
		
	}

}
