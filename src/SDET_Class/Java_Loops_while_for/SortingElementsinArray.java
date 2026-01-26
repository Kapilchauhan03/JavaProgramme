package SDET_Class.Java_Loops_while_for;

import java.util.Arrays;

public class SortingElementsinArray {
    public static void main(String[] args) {

        int a[] = {100,300,400,500,1,20};

        System.out.println("Before sorting Array");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));

    }
}
