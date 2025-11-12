package ex_23042024_if_else;

import java.util.Scanner;

public class Lab014 {
    public static void main(String[] args) {

        // Taking a input from the user using scanned class

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num%2 ==0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
        sc.close();
    }

}
