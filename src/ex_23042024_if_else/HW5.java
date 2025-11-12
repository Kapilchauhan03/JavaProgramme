package ex_23042024_if_else;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        // Print weeknames

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Week Number");
        int weekno = sc.nextInt();
        //int weekno =2;
        if(weekno==1){
            System.out.println("Monday");
        } else if (weekno==2) {
            System.out.println("Tuesday");
        } else if (weekno == 3) {
            System.out.println("Wednesday");
        } else if (weekno ==4) {
            System.out.println("Thursday");
        } else if (weekno==5) {
            System.out.println("Friday");
        } else if (weekno==6) {
            System.out.println("Saturday");
        } else if (weekno== 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("invalid week number");
        }
    }
}
