package topics;

public class C46_BreakContinue {

    public static void main(String[] args) {

        //break
        for (int i = 1; i < 100; i++) {
            if (i == 21) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        //continue
        for (int i = 1; i < 100; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }


    }

}
