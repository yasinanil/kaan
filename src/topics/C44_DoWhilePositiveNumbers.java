package topics;

import java.util.Scanner;

public class C44_DoWhilePositiveNumbers {
    /*
    Write a Java program that repeatedly asks the user to enter a positive integer.
    The program should calculate the sum of all entered positive integers.
    The loop should stop when the user enters a negative integer,
    and then the program should print the sum of all positive integers entered.
    Use a do-while loop for this task.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;
        do {
            System.out.println("Enter a positive integer:");
            number = scanner.nextInt();
            if (number > 0) {
                sum += number;
            }

        } while (number >= 0);

        System.out.println("sum = " + sum);

    }
}
