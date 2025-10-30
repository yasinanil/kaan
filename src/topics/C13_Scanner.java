package topics;


import java.util.Scanner;

public class C13_Scanner {

    public static void main(String[] args) {

        //Create Scanner object
        Scanner scanner = new Scanner(System.in);
        //Use the method and put the value in a container
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        System.out.println(number * number);
        System.out.println("Enter a double number:");
        double dNumber = scanner.nextDouble();
        System.out.println(dNumber * 2);

    }


}
