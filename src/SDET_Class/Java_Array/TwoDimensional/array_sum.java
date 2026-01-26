package SDET_Class.Java_Array.TwoDimensional;

public class array_sum {
    // sum the value using array
    public static void main(String[] args) {

        int a [] = {5,2,7,9,6};

        int sum=0;
//        for (int i=0; i<=a.length-1; i++)
//        {
//            sum = sum+a[i];
//        }
//        System.out.println("Sum of array elements " +sum);

        // Enhanced loop
        for (int value:a)
        {
        sum = sum+value;
        }
        System.out.println("sum of array elements " +sum);
    }
}
