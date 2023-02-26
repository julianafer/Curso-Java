package cursoJava;

import java.util.Scanner;

public class repeticao01 {
    
    public static void main(String[] args) {

        /*
        int cc = 0;
        do {
            System.out.println(cc);
            cc++;
        } while (cc < 4);
        */

        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? (S/N) ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.print("A soma de todos os valores é " + s);
        teclado.close();

    }

}
