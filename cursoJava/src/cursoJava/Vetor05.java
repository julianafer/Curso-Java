package cursoJava;

import java.util.Arrays;

public class Vetor05 {
    
    public static void main(String[] args) {
        
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int i : v) {
            System.out.print(i + " ");
        }

    }

}
