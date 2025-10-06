package topics;

public class C07_TypeCasting {

    public static void main(String[] args) {

        double number1 = 45.67;
        double price = 10;//Auto Widening
        System.out.println("price = " + price);

        int number2 = (int) 44.98;//Explicitly Narrowing
        System.out.println("number2 = " + number2);

        int result = (int) (5.0 / 3);
        System.out.println("result = " + result);

        double division = (double) 50 / 4;
        System.out.println("division = " + division);


    }
}
