package topics;

import java.util.Scanner;

public class C31_WithdrawMoney {

/*
    Check if a user can withdraw a certain amount based on these rules:
    •Minimum balance must remain 100
    •Amount must be a multiple of 10
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 500;
        System.out.println("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();

        if (amount % 10 == 0) {
            if (balance - amount >= 100) {
                balance -= amount;
            } else {
                System.out.println("Minimum balance must remain 100");
            }
        } else {
            System.out.println("Amount must be a multiple of 10");
        }

        System.out.println("balance = " + balance);
    }
}
