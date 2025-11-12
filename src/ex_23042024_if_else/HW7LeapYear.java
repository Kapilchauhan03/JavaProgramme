package ex_23042024_if_else;

import java.util.Scanner;

public class HW7LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();

        if((year%4 ==0 && year%100 != 0) || (year%400 == 0)) {
            System.out.println("it is a Leap Year");
        }else {
            System.out.println("it is not a leap year");
        }
        sc.close();
    }
}
