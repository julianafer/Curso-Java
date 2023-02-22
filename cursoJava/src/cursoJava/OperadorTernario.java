package cursoJava;

public class OperadorTernario {

	public static void main(String[] args) {

		int n1, n2, r, maior;
		n1 = 4;
		n2 = 8;
		
		r = n1>n2 ? 0 : 1;
		System.out.println(r);
		
		maior = n1>n2 ? n1 : n2;
		System.out.println("O maior valor eh " + maior);
		
	}

}
