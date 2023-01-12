package mentringTasks;

import java.util.Arrays;

public class Array_MergeTwoArrays {
    public static void main(String[] args) {


        /*
     Write method that takes two int[] and returns merged one
    int[] arr1={1,2,3,4,5}
    int[] arr2={12,13,14,15}

    output:
       {1,2,3,4,5,12,13,14,15}
        */

        int[] arr1={1,2,3,4,5};
        int[] arr2={12,13,14,15};
        System.out.println(Arrays.toString(merger(arr1,arr2)));


    }

    public static int[]  merger(int[]arr1,int[]arr2){
        int[] result=new int[arr1.length+arr2.length];
        int i=0; // indexing of result array
        for(int each:arr1){
            result[i++]=each;
        }
        for (int each:arr2){
            result[i++]=each;
        }
        return result;
    }


}
