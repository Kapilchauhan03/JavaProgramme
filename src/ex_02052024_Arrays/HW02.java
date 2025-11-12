package ex_02052024_Arrays;

import java.util.Arrays;

// Print max number from salary using arrays

public class HW02 {
    public static void main(String[] args) {

        int [] salary = {30,50,90,10,100,999};
        System.out.println(salary.length);
        System.out.println(Arrays.stream(salary).max());

        int max = salary [0];
        for (int i=0; i<salary.length; i++){
            if ( salary[i]>max)
            {
                max = salary[i];
            }
        }
        System.out.println("Maximum element is array is:" +max);

    }
}
