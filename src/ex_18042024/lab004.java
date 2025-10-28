package ex_18042024;

public class lab004 {
    // Increment Operator
    public static void main(String[] args) {
        int a = 10;
       // System.out.println(++a + ++a); // 11 + 12
        // System.out.println(++a + ++a + a++);  // 11 + 12 + 12
        System.out.println(++a + a++ + a++);  // 11 + 11 + 12

    }
}
