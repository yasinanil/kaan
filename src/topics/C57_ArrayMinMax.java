package topics;

import java.util.Arrays;

public class C57_ArrayMinMax {
    //Write a Java program to find the maximum and minimum elements in an array of integers.
    public static void main(String[] args) {

        int[][] numbers = {
                {15, 77, 86, 53},
                {52, 43, 84, 74},
                {11, 6, 97, 33},
                {5, 51, 62, 92},
                {9, 14, 65, 72},
        };

        int min = numbers[0][0];
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int number = numbers[i][j];
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
