package ex_07052024_Functions;

public class Lab036 {
    public static void main(String[] args) {

        // Functions
        // Here we are return something from

        for (int i = 0; i <=5; i++) {
            saysomething(); // Here saysomething calling function outside the main method
            //System.out.println("End");
            //kapil();
        }
    }

    static void kapil() {
        System.out.println("HiKC");
    }

    static void saysomething (){ // defining it
        System.out.println("Hello, How are you");
    }
}
