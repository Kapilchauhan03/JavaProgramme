package ex_02052024_Arrays;

public class Lab031 {
    public static void main(String[] args) {

        int [] ages = new int[8];
        System.out.println(ages.length);
        System.out.println(ages[5]);
        System.out.println(ages[2]);
      //   System.out.println(ages[8]); for this will get indexing error
          ages [2] = 20;
        System.out.println(ages[2]);

        for (int i =0; i< ages.length; i++){
            System.out.println(ages[i]);
        }
    }
}
