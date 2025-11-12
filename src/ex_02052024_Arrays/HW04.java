package ex_02052024_Arrays;

import java.util.Arrays;

public class HW04 {
    //write the cases for Double array
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        // Step 2: Create a new array to store the doubled values
        int[] doubled = new int[arr.length];

        // Step 3: Use a loop to go through each element in arr
        for (int i = 0; i < arr.length; i++) {
            // Multiply each element by 2 and store it in the new array
            doubled[i] = arr[i] * 2;
        }

        // Step 4: Print both arrays to see the results
        System.out.println("original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println("\nDoubled array:");
        for (int i = 0; i < doubled.length; i++) {
            System.out.println(doubled[i] + "");
        }
    }
}
