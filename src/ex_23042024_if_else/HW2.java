package ex_23042024_if_else;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

//  ✅ Largest in Three Number
//  Program to Find the Largest Among Three Numbers:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Number 1 is the greatest: "+num1);
        } else if (num2 > num3 && num2>num1) {
            System.out.println("Number 2 is the greatest: "+num2);
        }else {
            System.out.println("Number 3 is the greatest: "+num3);
        }
        sc.close();
    }
}
