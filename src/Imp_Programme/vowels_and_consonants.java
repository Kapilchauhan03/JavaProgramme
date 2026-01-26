package Imp_Programme;

import java.util.Scanner;

public class vowels_and_consonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Char");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowels");
        } else {
            System.out.println("Consonants");
        }
    }
}