package ex_23042024_if_else;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
//        ✅Check char is vowel, consonant
//                Program to Check if a Character is a Vowel or a Consonant.
//        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//          ->. vowel
//            else -> Consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any letter to check whether it's vowel or consonants");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        }else {
            System.out.println("Consonants");
        }
    }
}
