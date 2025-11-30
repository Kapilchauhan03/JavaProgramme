package ex_02052024_Arrays;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
//
//        StringBuffer stringBuffer = new StringBuffer("naman");
//        stringBuffer.reverse();
//        System.out.println(stringBuffer);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string, I will check if it's palindrome or not  ");
        String user_input = sc.next();

        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();
        if (user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome -->" +user_input);
        }else {
            System.out.println("Nope");
        }
    }
}
