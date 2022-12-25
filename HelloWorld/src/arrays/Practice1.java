package arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        // I will store 5 different ages into one array

        int[] ages=new int[5];    // 5 is representing the size of the array

        System.out.println(ages); // it will show hashcode (location of the array in the memory)
        System.out.println(Arrays.toString(ages)); // printing out array
        ages[0]=25;
        ages[1]=9;
        System.out.println(Arrays.toString(ages));
        ages[4]=89;
        // ages[5]=100;  ArrayIndexOutOfBoundsException

        // store 89 into the last position of the ages array

        System.out.println(Arrays.toString(ages));

        System.out.println(Arrays.toString(ages));

        System.out.println(ages[1]); //9

        // reassigning values

        ages[0]=35;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]);
        System.out.println(ages[4]);
        System.out.println(ages[ages.length-1]);
        // length --> the size of the array
        System.out.println(ages.length); // 5 : the size of the array





    }
}
