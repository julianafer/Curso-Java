package cursoJava;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		/*
		int n1 = 3;
		int n2 = 5;
		float m = (n1 + n2)/2;
		System.out.println("A media eh igual a " + m);
		*/
		
		int numero1 = 5;
		int valor1 = 5 + numero1++; // pos-incremento
		System.out.println(valor1);
		System.out.println(numero1 + "\n");
		
		int numero2 = 5;
		int valor2 = 5 + ++numero2; // pre-incremento
		System.out.println(valor2);
		System.out.println(numero2 + "\n");
		
		// class Math
		System.out.println(Math.PI); // constante pi
		System.out.println(Math.pow(5,2)); // exponenciação
		System.out.println(Math.sqrt(25)); // raiz quadrada
		System.out.println(Math.cbrt(27)); // raiz cúbica
		System.out.println(Math.abs(-10)); // valor absoluto (módulo)
		System.out.println(Math.round(5.6)); // arredonda normal
		System.out.println(Math.floor(3.9)); // arredonda para baixo
		System.out.println(Math.ceil(4.2)); // arredonda para cima
		
		// random
		double ale = Math.random();
		int n = (int) (5 + ale * (10 - 5));
		System.out.println("\n" + n);
		
	}

}
