package topics;

import java.util.Arrays;

public class C58_BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 17, 3, 20, 2, 1, 8, 4};

        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        //Bubble Sort:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
