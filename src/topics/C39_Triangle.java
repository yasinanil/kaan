package topics;

public class C39_Triangle {
    /*

     *
     * *
     * * *
     * * * *

     */

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {//Row control
            for (int j = 0; j <= i; j++) {//Column control
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
