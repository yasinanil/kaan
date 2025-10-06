package topics;

public class C05_PrintVariables {
    /*
    Declare and initialize variables for a car:
        Program Output:

        Make: Toyota
        Model: Camry
        Year: 2023
        Price: $25000.0
        Electric: false
     */

    public static void main(String[] args) {

        String make = "Toyota";
        String model = "Camry";
        int year = 2023;
        double price = 25000;
        boolean isElectric = false;

        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Electric: " + isElectric);

    }
}
