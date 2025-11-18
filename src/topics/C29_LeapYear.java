package topics;

import java.util.Scanner;

public class C29_LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            if (year % 100 == 0 || year % 200 == 0 || year % 300 == 0) {
                System.out.println(year + " is NOT a leap year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is NOT a leap year.");
            }
        }
    }
}
