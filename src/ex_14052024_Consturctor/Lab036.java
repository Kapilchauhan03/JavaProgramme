package ex_14052024_Consturctor;

public class Lab036 {
    public static void main(String[] args) {
        ATBPerson objRef1 = new ATBPerson();

        // 	DC are using to assign the values of instance variables of the class
        System.out.println(objRef1.courseName);

        ATBPerson kapil = new ATBPerson("Kapil",8952095360l);
        System.out.println(kapil.name);
        System.out.println(kapil.phone);

        ATBPerson Akki = new ATBPerson("Akki",8003042050l);
        System.out.println(Akki.name);
        System.out.println(Akki.phone);

        ATBPerson ladoo = new ATBPerson("Vedansh",9058690987l);
        System.out.println(ladoo.courseName);
        System.out.println(ladoo.phone);
        System.out.println(ladoo.name);

    }

}
