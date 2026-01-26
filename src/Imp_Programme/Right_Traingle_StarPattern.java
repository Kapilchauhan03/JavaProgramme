package Imp_Programme;

public class Right_Traingle_StarPattern {
    public static void main(String[] args) {
        int n= 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
