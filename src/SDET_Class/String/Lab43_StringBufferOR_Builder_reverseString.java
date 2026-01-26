package SDET_Class.String;

import java.sql.SQLOutput;

public class Lab43_StringBufferOR_Builder_reverseString {
    public static void main(String[] args) {

        // Reverse using String Buffer & Builder

        System.out.println("Reverse String using String Buffer---");
        StringBuffer sf = new StringBuffer("Welcome");
        System.out.println("Reverse String is --> "+ sf.reverse());

        System.out.println();

        System.out.println("Reverse String using String Builder---");
        StringBuilder SB = new StringBuilder("Welcome");
        System.out.println("Reverse String is ==> "+ SB.reverse());

    }
}
