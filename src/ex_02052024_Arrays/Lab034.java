package ex_02052024_Arrays;

public class Lab034 {
    public static void main(String[] args) {
        //Print 2d Array 3*2
        int [] [] array_2d = {
                {12,11},
                {13,22},
                {14,21}
        };
        for(int i =0; i<array_2d.length; i++){
            for(int j=0; j<array_2d[i].length; j++){
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
