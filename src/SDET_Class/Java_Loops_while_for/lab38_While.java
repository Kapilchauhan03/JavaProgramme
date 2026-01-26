package SDET_Class.Java_Loops_while_for;

public class lab38_While {

    public static void main(String[] args) {

        // Using While Loop
        // print 10 number


//        int i = 1;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }

        // Print Even & Odd number

        int i = 1;
        while (i<=10)
        {
            if(i%2==0)
            {
                System.out.println(i+ " Even Number");

            }else {
                System.out.println(i+ " Odd number");
            }
            i++;
        }
    }
}
