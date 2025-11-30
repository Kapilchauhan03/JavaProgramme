package ex_07052024_Functions;

public class Lab037 {
    public static void main(String[] args) {
        // non returning type- Function
        // main is also a function
//        sayHi();
//        sayHi();
//        sayHi();
//        sayHi();
//        sayHi();
//        sayHi();
        for(int i=0; i<10; i++){
            sayHi();
            rama();
        }
    }

    static void rama() {
        System.out.println("Byee");
    }

    static void sayHi (){
        System.out.println("Hello Hi");
    }
}
