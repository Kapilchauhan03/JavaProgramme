package ex_20042024;

public class HW04 {
    public static void main(String[] args) {
        double x = 10;
        double y = 12.4;
        double z = 56.78;

        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
    }
}
