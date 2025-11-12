package ex_20042024;

public class Lab007 {
    public static void main(String[] args) {

        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP String constant Pool
        String name2 = new String("The Testing Academy"); // Heap Area ( OA )

        System.out.println(name == name1);
        System.out.println(name == name2); // These == equals are checking Reference
        System.out.println(name.equals(name1)); // Here  equals are checking Values
        System.out.println(name.equals(name2)); // Here it will check the content name
    }
}
