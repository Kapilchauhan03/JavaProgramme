package ex_23042024_if_else;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {
        // Max number in two

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2");
        int num2 = sc.nextInt();

        if ( num1 > num2){
            System.out.println("Max is --> "+num1);
        }else {
            System.out.println("Max is --> "+num2);
        }

        sc.close();

    }
}
