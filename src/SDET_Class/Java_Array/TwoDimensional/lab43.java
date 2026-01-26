package SDET_Class.Java_Array.TwoDimensional;

public class lab43 {
    // Two / Multi dimensional Array
    // Approach 1

    public static void main(String[] args) {

        int a [][] = new int [3][2];

        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

        System.out.println("Array length of rows" + a.length);
        System.out.println("Array length of coloum" + a[0].length);


    }
}
