package SDET_Class.Java_Loops_while_for;

public class MinimumNumberArray {
    public static void main(String[] args) {

        int a[] = {200,3,21,-1,45,677,789,};
        int min = a[0];

        for (int i=1; i<a.length; i++)
        {
            if (a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("Minimum value in an Array is ----> " +min);
    }
}
