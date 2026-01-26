package SDET_Class.OOPS;

public class StudentMain
{
    public static void main(String[] args)
    {

        // Store data into variables
        // Approach 1 - using Object reference Variables
//        Student stu = new Student();
//        stu.sid = 1031105;
//        stu.sname = "KC";
//        stu.grad = 'A';
//        stu.printStudentData();

        // 2 Approach using Method
//        stu.setStudentData(122, "PK",'C');
//        stu.printStudentData();

        // 3 Approach using Constructor
        Student stu = new Student(101,"john",'A');
        stu.printStudentData();

    }





}
