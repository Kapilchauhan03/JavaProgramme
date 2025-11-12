package ex_25042024;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
//        Switch Java Programs
//        Program to Perform Arithmetic Operations
//        Take a input from user, input1, input2 as int and ask the user
//        what you want to do, enter char +,*,/ ,%, - ,
//        you will share the result by using the switch.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 ");
        int num1 = sc.nextInt();

        System.out.println("Enter Num2");
        int num2 = sc.nextInt();

        System.out.println("Which action do you want to perform");
        char ch = sc.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println("result: " + (num1 + num2));
                break;
            case '*':
                System.out.println("result: " + (num1 * num2));
                break;
//        int result;
//
//        switch (ch){
//            case '+': result = num1 + num2;
//                System.out.println("The result is:" +result);
//                break;
//            case '-': result = num1 - num2;
//                System.out.println("The result is:" +result);
//                break;
//            case '*': result = num1 * num2;
//                System.out.println("The result is:" +result);
//                break;
//            case '/': result = num1 / num2;
//                System.out.println("The result is:" +result);
//                break;
//            case '%': result = num1 % num2;
//                System.out.println("The result is:" +result);
//                break;
//            default:
//                System.out.println("Invalid input");
        }
        sc.close();

    }
}
