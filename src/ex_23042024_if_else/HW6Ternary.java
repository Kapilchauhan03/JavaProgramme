package ex_23042024_if_else;

import java.util.Scanner;

public class HW6Ternary {
    public static void main(String[] args) {
        // largest number find using three number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number2");
        int num2 = sc.nextInt();

        System.out.println("Enter Number3");
        int num3 = sc.nextInt();

        int largest = (num1 > num2) ? ((num1> num3)?num1 : num3) : ((num2>num3) ? num2 : num3);
        System.out.println("Largest Number is :" +largest);
    }
}
