package cursoJava;

public class ComparacaoString {

	public static void main(String[] args) {

		String nome1 = "Juliana";
		// String nome2 = "Juliana";
		String nome3 = new String("Juliana");
		
		String res1, res2;
		
		// vai dar diferente porque == vê diferença no objeto (new)
		res1 = nome1==nome3 ? "igual" : "diferente";
		System.out.println(res1);
		
		// vai dar igual porque o equals identifica o conteúdo do objeto
		res2 = nome1.equals(nome3) ? "igual" : "diferente";
		System.out.println(res2);
		
		// Operadores lógicos
		
		/*
		 * && → e
		 * || → ou
		 * ^  → ou exclusivo
		 * !  → não
		 */
		
	}

}
