package topics;

import java.util.Scanner;

public class C40_Pyramid {

    /*

        *
       * *
      * * *
     * * * *

     */

    public static void main(String[] args) {

        System.out.println("Enter number of rows:");
        int rows = new Scanner(System.in).nextInt();

        for (int i = 0; i < rows; i++) {//Row control

            for (int j = rows - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {//Column control
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
