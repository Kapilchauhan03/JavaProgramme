package ex_27042024;

public class reverse_String {
    public static void main(String[] args) {

        // Using String Buffer
        String str = "ABCDE"; // 0,1,2,3
        String rev = "";

        int len = str.length(); //4,3,2,1

        for (int i =len-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("Reversed String is "+ rev);

//
//        StringBuffer SB = new StringBuffer(str);
//        System.out.println(SB.reverse());

    }
}
