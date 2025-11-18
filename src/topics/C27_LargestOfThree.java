package topics;

public class C27_LargestOfThree {

    //Determine the largest among three numbers.
    public static void main(String[] args) {

        int a = 1000, b = 1000, c = 100;

        if (a > b && a > c) {
            System.out.println(a + " is largest!");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest!");
        } else if (c > a && c > b) {
            System.out.println(c + " is largest!");
        } else if (a == b && a > c) {
            System.out.println(a + " is largest!");
        } else if (a == c && a > b) {
            System.out.println(a + " is largest!");
        } else if (b == c && b > a) {
            System.out.println(b + " is largest!");
        } else {
            System.out.println(b + " is largest!");
        }
    }
}
