package SDET_Class.String;

public class Lab41_reverseString {
    public static void main(String[] args) {

        // Approach 1 using length () & charAt() reverse the string

        String s = "Kapil";
        String rev = "";

        for (int i=s.length()-1; i>=0; i--)
        {
            rev = rev+s.charAt(i);
        }
        System.out.println("Reverse String is --> " +rev);
    }
}
