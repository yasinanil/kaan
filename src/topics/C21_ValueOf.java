package topics;

public class C21_ValueOf {

    public static void main(String[] args) {

        int number = 76543;
        String strNumber = String.valueOf(number);
        String firstDigit = String.valueOf(strNumber.charAt(0));
        System.out.println("firstDigit = " + firstDigit);

        int num = 987654;
        System.out.println(String.valueOf(num).charAt(0));

        String price = "35.9";
        double dPrice = Double.valueOf(price)+0.1;
        System.out.println("dPrice = " + dPrice);

    }
}
