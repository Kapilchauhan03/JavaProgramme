package ex_23042024;

public class lab005 {
    //String class
    // Check the available functions
    // Non Primitive- String - have many functionless
    // Primitive data types:- byte, int, flot, short, double, char,Boolean - not having extra function
    public static void main(String[] args) {

        // Below are two formation to type String
        String name = "Kapil";
        String name2 = new String("Kapil");

        name = "kaps";

        System.out.println("Your Name is --->" +name);
        System.out.printf("Your Name is ---> %s", name2);

        System.out.println( " \n --- All the functions -----");
        System.out.println(name.getBytes());
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

    }
}
