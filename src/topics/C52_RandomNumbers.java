package topics;

public class C52_RandomNumbers {
    /*

        1 1 0 1
        1 0 0 1
        1 0 1 1
        0 1 0 1

     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((int) (Math.random() * 2)+ " ");
            }
            System.out.println();
        }

    }

}
