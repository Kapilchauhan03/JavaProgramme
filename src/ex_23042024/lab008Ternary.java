package ex_23042024;

public class lab008Ternary {
    public static void main(String[] args) {

        // Ternary operator
        boolean result = 10>40 ? 10>40: 40>10;
        boolean result1 = 10>40 ? 10>40: 40<10;
        System.out.println(result);
        System.out.println(result1);

        int a = true ? 10:20;

        int a1 = (30>40) ? 10: 20;
        System.out.println(a1);

        String str = 10>20 ?"10" : "TWENTY";
        System.out.println(str);
    }
}
