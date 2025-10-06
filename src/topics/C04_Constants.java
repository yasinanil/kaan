package topics;

public class C04_Constants {

    public static void main(String[] args) {

        final double PI = 3.14;
        //PI = 5; -> final variables can not change the value.

        final String SCHOOL_NAME;
        SCHOOL_NAME = "My School";
        // SCHOOL_NAME = "H";

        double radius = 5.2;
        double perimeter = 2 * PI * radius;
        System.out.println("perimeter = " + perimeter);
        double area = PI * radius * radius;
        System.out.println("area = " + area);


    }

}
