package ex_23042024_if_else;

public class Lab011 {
    public static void main (String[] args ){


        int a = 4;
        if (a == 4){   // here we can't assign a=10 as this return value in int
                           // - but we require value in boolean
            System.out.println("Say Hi");
        }else{
            System.out.println("Say Bye");
        }
    }
}
