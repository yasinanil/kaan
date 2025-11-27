package topics;

public class C35_ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        String str = "Hello World, How are you?";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+"\t");
        }
    }
}
