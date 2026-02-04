package topics;

import java.util.Arrays;

public class C56_MultidimensionalArrays {

    public static void main(String[] args) {

        int[][] matrix = new int[3][4];
        matrix[0][2] = 3;
        matrix[2][1] = 5;
        matrix[0][0] = 1;
        matrix[1][1] = 7;
        matrix[1][3] = 2;
        matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] = 4;//Last element

        System.out.println(Arrays.deepToString(matrix));

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("sum = " + sum);

        String[][] words = {
                {"John", "Mary", "Tom"},
                {"Tim", "Zoey", "Joseph"},
                {"Aaron", "Bob", "Cedric"},
                {"Kevin", "Lily", "Mike"},
                {"Sam", "Eric", "Ali"},
        };

        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                String word = words[i][j];
                for (int k = 0; k < word.length(); k++) {
                    if ("aeiou".contains(word.substring(k, k + 1).toLowerCase())) {
                        counter++;
                    }
                }
            }
        }

        System.out.println("Number of wovels in array: " + counter);

    }

}
