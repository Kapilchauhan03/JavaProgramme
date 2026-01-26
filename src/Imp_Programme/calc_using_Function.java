package Imp_Programme;

import java.util.Scanner;

public class calc_using_Function {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int r_sum = sum(num1, num2);
        System.out.println("Sum is--> "+r_sum);

        int r_sub = sub(num1, num2);
        System.out.println("Sub is--> "+r_sub);

        int r_multiply = multiply(num1, num2);
        System.out.println("multiply is--> "+r_multiply);

        int r_divide = divide(num1, num2);
        System.out.println("divide is--> "+r_divide);

    }
    static int sum(int a, int b) {
        return a+b;
    }
    static int sub(int a, int b) {
        return a-b;
    }
    static int multiply(int a, int b) {
        return a*b;
    }
    static int divide(int a, int b) {
        return a/b;
    }
}
