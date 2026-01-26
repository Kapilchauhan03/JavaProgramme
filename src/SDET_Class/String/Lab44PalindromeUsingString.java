package SDET_Class.String;

public class Lab44PalindromeUsingString {
    public static void main(String[] args) {

        // Using CharAT or rev

        String s = "LOL";
        String rev = "";

        for (int i=s.length()-1; i>=0; i--)
        {
            rev = rev+s.charAt(i);
        }
        if (s.equals(rev))
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
