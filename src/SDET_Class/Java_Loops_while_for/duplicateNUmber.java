package SDET_Class.Java_Loops_while_for;

public class duplicateNUmber {
    public static void main(String[] args) {

        int a[] = {100,200,100,300,400,100,500,100};
        int num = 100;
        int count =0;

        for (int i=0; i<a.length; i++)
        {
            if(a[i]==num)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
//
//// using enhanced loop
//          for(value:a)
//          {
//              if(value==num)
//        {
//            count++;
//        }
//              sout(count);
//
//        }