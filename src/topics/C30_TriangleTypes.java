package topics;

import java.util.Scanner;

public class C30_TriangleTypes {
    //Given 3 sides, determine if the triangle is equilateral, isosceles or scalene.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = scanner.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles");
        }else {
            System.out.println("Scalene");
        }
    }
}
