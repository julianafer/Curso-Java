package cursoJava;

public class Vetor01 {
    
    public static void main(String[] args) {

        int n[] = {3,2,8,7,5,4};
        for(int c=0; c<n.length; c++) {
            if (c == n.length-1) {
                System.out.println(n[c] + " ");
            } else {
                System.out.print(n[c] + " ");
            }
        }
        System.out.print("Total de casas de N: " + n.length);

    }

}
