package ex_14052024_Consturctor;

public class ATBPerson {

    // Below are the Instance variables
    // calling for Lab036
    String name;
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    // Constructor
    // here we are called Constructor to assign the value & it's called
    // default constructor

    ATBPerson(){
        System.out.println("DC");
        courseName = "ATB";
    }

    // parametrized constructor
    ATBPerson(String givenName, long phoneNo){
        System.out.println("Param Constructor");
        this.name = givenName;
        this.phone = phoneNo;
    }
}
