package topics;

public class C42_FirstDigit {
    //Type code to get first digit of an inter by using while loop.
    public static void main(String[] args) {

        int number = 357;

        while (number > 9) {
            number /= 10;//number = number / 10;
        }
        System.out.println("First Digit: " + number);
    }
}
