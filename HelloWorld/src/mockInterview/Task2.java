package mockInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    /*



     */

    public static void main(String[] args) {

        int[] array = {2, 4, 88, 100,900, 1, 5,102,0,88,860,-3,-100,90000,-9000};

        //System.out.println(array[0]);
        secondLargest(array);
    }

    public static void secondLargest(int[] array) {
        int m = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i]>m){
                    m=array[i];
                }
            }
        System.out.println("largest: "+m);
        int n=0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>n && array[i]<m){
                n=array[i];
            }
        }
        System.out.println("Second Larger: "+n);

        int k = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {

            if (array[i]<k){
                k=array[i];
            }
        }
        System.out.println("smallest: "+k);

        for (int i=0;i<array.length;i++){

            for (int j=i+1;j<array.length;j++){
                int temp=0;
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }


        }
        System.out.println("=========Sorting===========");
        System.out.println(Arrays.toString(array));

        }



}



