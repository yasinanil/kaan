package topics;

public class C43_DoWhileLoop {

    public static void main(String[] args) {

        int number = 1;

        do {
            System.out.println(number++);
        } while (number <= 100);

        //number++ = post-increment
        //++number = pre-increment

    }
}
