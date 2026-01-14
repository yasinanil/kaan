package topics;

import java.util.Arrays;

public class C55_Arrays {

    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[5];

        numbers[3] = 6;
        numbers[1] = 4;
        numbers[0] = 2;
        numbers[2] = 5;
        numbers[4] = 7;

        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println(numbers[4] + 3);//10

        int numberOfElements = numbers.length;
        System.out.println("numberOfElements = " + numberOfElements);

        String[] names = {"Tim", "Tom", "Jane", "Mary", "Bob"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println("\nFirst element: " + names[0]);
        System.out.println("Last Element: " + names[names.length - 1]);
        //System.out.println(names[5]); //=> ArrayIndexOutOfBoundsException

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum = " + sum);

    }
}
