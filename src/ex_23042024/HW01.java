package ex_23042024;

public class HW01 {
    // max between 3 number
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max = (a>b && a>c) ? a : (b>c && b>a) ? b: c;
        int min = (a<b && a<c) ? a : (b<c && b<a) ? b :c;

        System.out.println(max);
        System.out.println(min);
    }
}
