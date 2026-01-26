package SDET_Class.Java_Loops_while_for;

import java.util.Arrays;

public class SortingStringorChar {
    public static void main(String[] args) {

        // char c[] = {'V','A','R','U','A','P','B','K'};
           String c[] = {"Rani","Kapil","Akshay","Mom", "Dad"};


        System.out.println("Before Sorting an array");
        System.out.println(Arrays.toString(c));

        Arrays.sort(c);


        System.out.println("After sorting an array" + Arrays.toString(c));
    }
}
