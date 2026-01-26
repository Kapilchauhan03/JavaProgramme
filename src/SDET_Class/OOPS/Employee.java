package SDET_Class.OOPS;

public class Employee
{

    // Variables
    // cannot create method inside the method
    int eid;
    String ename;
    String job;
    int sal;

    // Method
    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }

//    public static void main(String[] args)
//    {
//
//        Employee emp = new Employee();
//        emp.eid = 123;
//        emp.ename = "KP";
//        emp.job = "Senior QA";
//        emp.sal = 1500000;
//        emp.display();
//    }
}
