package ex_23042024;

public class lab009 {
    // find max & min using Ternary operator
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int max = a<b ? b : a;
        int min = a<b ? a : b;

        System.out.println(max);
        System.out.println(min);
    }
}
