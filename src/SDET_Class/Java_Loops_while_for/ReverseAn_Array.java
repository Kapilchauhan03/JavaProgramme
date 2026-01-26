package SDET_Class.Java_Loops_while_for;

import java.util.Arrays;

public class ReverseAn_Array
{
    public static void main(String[] args)
    {

        int a[] = {100,200,300,400,500};
        System.out.println(Arrays.toString(a));

        // here we have to reverse the string for

        for (int i=a.length-1; i>=0; i--)
        {
            System.out.println(a[i]);
        }

    }
}
