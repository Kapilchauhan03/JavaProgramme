package SDET_Class.Java_Array.TwoDimensional;

public class lab44 {
    // Approach 2

    public static void main(String[] args) {

        int a [][] = {
                {100,200},
                {300,400},
                {500,600}
        };
        // size of an array
        System.out.println("Array length of rows" + a.length);
        System.out.println("Array length of coloum" + a[0].length);

        // read single value from array\
        System.out.println(a[2][1]);
        // Printing Row & Coloum size

        for (int r=0; r<=2; r++)
        {
            for (int c=0; c<=1; c++)
            {
                System.out.print(a[r][c]+ " ");
            }
            System.out.println();
        }
    }
}
