package ex_11052024_Object_Class;

public class runnerStudent {
    public static void main(String[] args) {

        Student firststudent = new Student();
        firststudent.phoneNumber = 8952095360l;
        firststudent.name = "kapil";
        firststudent.rollno = 23;
        System.out.println(firststudent.name);
        System.out.println(firststudent.rollno);
        System.out.println(firststudent.phoneNumber);

        // Second student
        System.out.println("\n\nSecond student details");
        Student secondstudent = new Student();
        secondstudent.phoneNumber = 8952083974l;
        secondstudent.name = "Akki";
        secondstudent.rollno = 33;
        System.out.println(secondstudent.name);
        System.out.println(secondstudent.rollno);
        System.out.println(secondstudent.phoneNumber);

    }
}
