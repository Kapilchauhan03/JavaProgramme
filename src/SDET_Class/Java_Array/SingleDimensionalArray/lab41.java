package SDET_Class.Java_Array.SingleDimensionalArray;

public class lab41 {
    // Arrays
    public static void main(String[] args) {

        // Approach 1 This approach will follow once we are not dicided in future we have to add more array value
        // more dynamic in nature & we can add values anytime & remove the values
        // Single Dimensional array
        int a[] = {100,200,300,400,500};
        System.out.println(a.length);

        System.out.println(a[0]);
       // System.out.println(a[5]); Exception

//        // reading all values from array
//        for (int i=0; i<5; i++){
//            System.out.println("value of array" + a[i]);
//        }

        // enhanced for loop
        for(int x : a)
        {
            System.out.println(x);
        }
    }
}
