package ex_02052024_Arrays;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        System.out.println("enter the first subject 1 marks");
        marks[0] = sc.nextFloat();
        System.out.println("enter the first subject 2 marks");
        marks[1] = sc.nextFloat();
        System.out.println("enter the first subject 3 marks");
        marks[2] = sc.nextFloat();
        System.out.println("enter the first subject 4 marks");
        marks[3] = sc.nextFloat();
        System.out.println("enter the first subject 5 marks");
        marks[4] = sc.nextFloat();

        for (int i=0; i < marks.length; i++){
            if (marks[i]<30){
                System.out.println("Failed in the Subject --> " +marks[i]);
            }
            else {
                System.out.println(marks[i]);
            }
            sc.close();

        }




    }
}
