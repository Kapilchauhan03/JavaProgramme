package ex_14052024_Consturctor;

public class Lab037 {
    public static void main(String[] args) {

        Bank_Account sbi_ref = new Bank_Account();
//        sbi_ref.balance= 1000;
//        System.out.println(sbi_ref.balance);
        sbi_ref.printdetails();

        System.out.println("\nICICI Bank details");

        Bank_Account icici_ref = new Bank_Account("ICICI",20,"ICICIN004");
        icici_ref.printdetails();

        System.out.println("\nAxis Bank details");
        Bank_Account axis_ref = new Bank_Account("Axis Bank", 90000,"AxisN007");
        axis_ref.printdetails();



    }
}
