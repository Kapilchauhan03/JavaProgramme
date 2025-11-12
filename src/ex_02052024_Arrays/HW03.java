package ex_02052024_Arrays;

public class HW03 {

    // Print min salary using arrays
    public static void main(String[] args) {

        int salary [] = {30,40,60,99,9999,1,-66};
        int min = salary[0];

        for ( int i=0; i<salary.length; i++){
            if (salary[i] < min){
                min = salary[i];
            }
        }
        System.out.println("Minimum element array is: "+min);

    }
}
