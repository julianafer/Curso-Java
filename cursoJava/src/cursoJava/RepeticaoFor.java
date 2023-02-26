package cursoJava;

public class RepeticaoFor {
    
    public static void main(String[] args) {

        /* 
        for (int cc=15; cc>=5; cc-=2) {
            System.out.println(cc);
        }
        */

        // for aninhado
        for (int i=1; i<=3; i++) {
            for (int j=0; j<=2; j+=2) {
                System.out.println("i=" + i + " j=" + j);
            }
        }

    }

}
