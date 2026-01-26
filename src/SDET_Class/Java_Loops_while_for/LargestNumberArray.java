package SDET_Class.Java_Loops_while_for;

public class LargestNumberArray {
    public static void main(String[] args) {

        int a[] = {100,20,30,3000};
        int max = a[0];

        for (int i=1; i<a.length; i++)
        {
            if (a[i]>max)
            {
                max= a[i];
            }
        }
        System.out.println("Maximum number in an array is ----> " +max);


    }
}
