package topics;

public class C12_PrimeNumber {

    public static void main(String[] args) {

        int number = 121;

        boolean isDivisible2 = number % 2 != 0;
        boolean isDivisible3 = number % 3 != 0;
        boolean isDivisible5 = number % 5 != 0;
        boolean isDivisible7 = number % 7 != 0;
        boolean isPrime = isDivisible2 && isDivisible3 && isDivisible5 && isDivisible7;
        System.out.println("is " + number + " prime = " + isPrime);

    }

}
