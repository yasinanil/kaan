package topics;

public class C41_WhileLoop {

    public static void main(String[] args) {

        int x = 1;

        while (x < 5) {
            System.out.print(x + "\t");
            x++;
        }

        System.out.println();
        int y = 1;
        while (y < 101) {
            if (y % 2 == 0) {
                System.out.print(y + "\t");
            }
            y++;
        }
    }
}
