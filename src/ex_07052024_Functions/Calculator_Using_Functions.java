package ex_07052024_Functions;

public class Calculator_Using_Functions {
    public static void main(String[] args) {
        int result = addition(9, 10);
        System.out.println(result);

        int result1 = minus(9, 10);
        System.out.println(result1);

        int result3 = sub(20, 10);
        System.out.println(result3);

    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }
    static int sub (int a, int b){
        return a/b;}
}