package ex_07052024_Functions;

public class Lab039 {
    public static void main(String[] args) {

        // parameter also they can take

        int r1 = sumOfTwo(4,6);
        System.out.println(r1);
        int r2 = sumOfTwo(9,6);
        System.out.println(r2);
        String r3 = sumOfTwo("Kaps", 9);
        System.out.println(r3);
    }
    // below exm.of same parameter or same data types
    static int sumOfTwo(int a, int b){
        return a + b;
    }
    // Belwo Exm. of different parameter or different data types
    static String sumOfTwo(String a, int b){
        return a + b;
    }
}
