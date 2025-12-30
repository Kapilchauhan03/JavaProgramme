package ex_14052024_Consturctor;

public class Bank_Account {

    // class calling Lab037
    String bankName;
    int balance;
    String Bankcode;

    Bank_Account (){   // Default constructor
        bankName = "sbi";
        balance = 10;
        Bankcode = "SBIN003";
    }

    public Bank_Account(String bankName, int balance, String bankcode) {
        this.bankName = bankName;
        this.balance = balance;
        this.Bankcode = bankcode;
    }

    void printdetails (){
        System.out.println("Bank Name --> " + bankName);
        System.out.println("Balance --> " + balance);
        System.out.println("Bankcode -> " + Bankcode);
    }
}
