package topics;

import java.util.Scanner;

public class C54_GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100 + 1);
        //System.out.println("randomNumber = " + randomNumber);
        System.out.println("Enter a number:");
        int number;
        do {
            number = scanner.nextInt();
            if (number > randomNumber) {
                System.out.println("Enter a smaller number:");
            } else if (number < randomNumber) {
                System.out.println("Enter a larger number:");
            }

        } while (number != randomNumber);

        System.out.println("Conratualtions, you found the number!");

    }
}
