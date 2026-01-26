package SDET_Class.String;

public class Lab42_ReverseString_Array {
    public static void main(String[] args) {

        String s = "WELCOME";
        String rev = "";

        char a[] = s.toCharArray();
        for (int i=a.length-1; i>=0; i--)
        {
            rev = rev+a[i];
        }
        System.out.println("Reverse String is --> " +rev);

    }
}
