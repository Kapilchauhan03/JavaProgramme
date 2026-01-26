package SDET_Class.Java_Conditional_Statements;

public class lab37_ternary {
    public static void main(String[] args) {

        // largest of two number using Ternary
//        condition ? expression_if_true : expression_if_false;
        int a = 20, b=30;

        int max = a<b ? b : a;  // 20<30 30 20
        int min = a<b ? a : b;    // 20<30 20 30
        System.out.println(max);
        System.out.println(min);
    }
}
