package SDET_Class.OOPS;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.eid = 123;
        emp.ename = "KP";
        emp.job = "Senior QA";
        emp.sal = 1500000;
        emp.display();
    }
}
