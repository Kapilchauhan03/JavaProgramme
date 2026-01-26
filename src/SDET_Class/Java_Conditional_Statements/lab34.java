package SDET_Class.Java_Conditional_Statements;

public class lab34 {
    // largest of three numbers
    public static void main(String[] args) {
        int a=-1000, b=200, c=30;

        if (a>b && a>c)
        {
            System.out.println("A is largest number" +a);
        } else if (b>c && b>a) {
            System.out.println("B is largest number" +b);
        }else {
            System.out.println("C is largest Number" + c);
        }

    }
}
