package ex_25042024;

import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {
        // Print Vowel using Switch statements

        System.out.println("Enter a char, I will tell you, if it is a vowel or consonants");
        Scanner sc = new Scanner(System.in);
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch(user_input){
            case 'a':
                System.out.println("Vowel");
            break;
            case 'e':
                System.out.println("Vowel");
            break;
            case 'i':
                System.out.println("Vowel");
            break;
            case 'o':
                System.out.println("Vowel");
            break;
            case 'u':
                System.out.println("Vowel");
            break;
            default:
                System.out.println("Consonant");
        }
        sc.close();

    }
}
