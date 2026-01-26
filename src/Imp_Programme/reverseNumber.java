package Imp_Programme;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int rev = 0;
        while (num!=0){
            rev =rev*10 + num%10;
            num = num/10; // number will be eliminated that is why we are using this
        }
        System.out.println("reverse number is "+rev);
    }
}
