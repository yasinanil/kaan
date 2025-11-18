package topics;

import java.util.Scanner;

public class C25_Grade {

/*
    •Take a student's grade from user to represent the student's score.
    •Use nested If statements to evaluate the score and assign a grade.
    •If the score is 90 or higher, print "Grade: A".
    •If the score is between 80 and 89, print "Grade: B".
    •If the score is between 70 and 79, print "Grade: C".
    •If the score is below 70, print "Grade: D".
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade = scanner.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("Invalid Grade");
        } else {
            if (grade > 89) {
                System.out.println("A");
            } else if (grade > 79) {
                System.out.println("B");
            } else if (grade > 69) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }
}
