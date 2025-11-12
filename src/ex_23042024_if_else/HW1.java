package ex_23042024_if_else;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
//        ✅ Positive / Negative Number
//        Program to Check if a Number is Positive, Negative, or Zero.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number is Positive");
        }else if (num <0){
            System.out.println("Number is Negative");
        }else {
            System.out.println("number is Zero");
        }
        sc.close();
    }
}
