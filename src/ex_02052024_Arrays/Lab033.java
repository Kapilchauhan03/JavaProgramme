package ex_02052024_Arrays;

public class Lab033 {
    // 2D Array
    public static void main(String[] args) {

        int [][] array_2d= {
                {34,12,11},
                {34,12,34},
                {11,23,98}

        };
        for (int i =0; i<array_2d.length; i++){
            for(int j =0; j<array_2d[i].length; j++){
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
