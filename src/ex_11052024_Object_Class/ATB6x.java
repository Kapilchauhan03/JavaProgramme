package ex_11052024_Object_Class;

import java.sql.SQLOutput;

public class ATB6x {
    public static void main(String[] args) {

        System.out.println("\ncourse details");
        Course C = new Course();
        C.courseID = 123;
        C.courseName = "Science";
        C.stream = "Physics";
        System.out.println(C.courseID);
        System.out.println(C.courseName);
        System.out.println(C.stream);

        System.out.println("\nPayment deails");
        Payment p = new Payment();
        p.BankID = 123;
        p.MOP = "online";
        p.BankName = "HDFC";
        System.out.println(p.BankID);
        System.out.println(p.MOP);
        System.out.println(p.BankName);

        System.out.println("\nStudent details");
        Student1 s1 = new Student1();
        s1.name = "kapil";
        s1.phoneNo = 8952095360l;

        System.out.println(s1.name);
        System.out.println(s1.phoneNo);


    }
}
