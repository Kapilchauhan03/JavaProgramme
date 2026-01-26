package SDET_Class.Java_Conditional_Statements;

public class lab36_switch {
    // week number print using Switch
    // Syntax switch(){
    //  case 1 : sout}
    // weekno = Variable

    public static void main(String[] args) {

        int weekno = 10;

        switch (weekno) {
            case 1 : System.out.println("Monday"); break;
            case 2 : System.out.println("Tuesday");break;
            case 3 : System.out.println("Wednesday");break;
            case 4 : System.out.println("Thursday");break;
            case 5 : System.out.println("Friday");break;
            case 6 : System.out.println("Saturday");break;
            case 7 : System.out.println("Sunday");break;
            default: System.out.println("invalid Week number");
            break;
         }
    }
}
