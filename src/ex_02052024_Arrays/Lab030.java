package ex_02052024_Arrays;

import java.util.Arrays;

public class Lab030 {
    public static void main(String[] args) {

        int [] age = {27,28,29,30,31}; // - Fixed elements
        System.out.println(age.length);
        System.out.println(Arrays.stream(age).min());

        int [] age2 = new int[5];
        System.out.println(age2[0]);
        System.out.println(age2[2]);

        age2 [2] = 12;
        System.out.println(age2[2]);


    }
}
