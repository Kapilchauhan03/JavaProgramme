package ex_23042024_if_else;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        if(number > 20){
            System.out.println("num >20");
        }else if (number >10){
            System.out.println(" num is between 10 & 20");
        }else{
            System.out.println("num is <20");
        }
    }
}
