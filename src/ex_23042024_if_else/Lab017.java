package ex_23042024_if_else;

public class Lab017 {
    public static void main(String[] args) {

        int a= 100;
        int b= 20;
        int c=3;

        if (a<b && a<c){
            System.out.println("a is smallest number");
        } else if (b<a && b<c) {
            System.out.println("b is smallest number");
        }else {
            System.out.println("c is smallest number");
        }

    }
}
