package topics;

import java.util.Scanner;

public class C54_GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100 + 1);
        //System.out.println("randomNumber = " + randomNumber);
        System.out.println("Welcome to Number Guess Game!\nEnter a number:");
        int number;
        int counter = 0;
        do {
            counter++;
            number = scanner.nextInt();
            if (number > randomNumber) {
                System.out.println("Enter a smaller number:");
            } else if (number < randomNumber) {
                System.out.println("Enter a larger number:");
            }
            if (counter == 10 && number != randomNumber) {
                System.out.println("You could not find the number in 10 tries! You lose!");
                System.out.println("To play again enter: 1\nTo exit enter: 2");
                if (scanner.nextInt() == 1) {
                    counter = 0;
                    randomNumber = (int) (Math.random() * 100 + 1);
                    System.out.println("Welcome again!\nEnter a number:");
                } else {
                    System.out.println("GOODBYE ! ! !");
                    break;
                }

            }
            if (number == randomNumber) {
                System.out.println("Congratulations, you found the number in " + counter + " try/tries!");
                System.out.println("Your point: " + (11 - counter) * 10);
            }

        } while (number != randomNumber);


    }
}
