package ex_02052024_Arrays;

public class HW05 {
    public static void main(String[] args) {
        // Double the aarays

        int[] arrays = {1, 40, 50};
        int[] arrays2 = new int[3];

        for (int i = 0; i < arrays.length; i++) {
            arrays2[i] = arrays[i] * 2;
        }
        System.out.println("Printing the arrays");
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println(arrays2[i]);
        }
    }


    }

