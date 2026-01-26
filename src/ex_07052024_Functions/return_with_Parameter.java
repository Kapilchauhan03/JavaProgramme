package ex_07052024_Functions;

public class return_with_Parameter {
    public static void main(String[] args) {

        int r1 = sumofTwo(7,9);
        System.out.println(r1);
        int r2 = sumofTwo(10,10);
        System.out.println(r2);
        // Calling String
        String r3 = sumofTwo("Kapil", 3);
        System.out.println(r3);

    }
    static int sumofTwo(int a,int b ){
        return a+b;
    }
    static String sumofTwo(String a,int b ){
        return a+b;
    }

}
