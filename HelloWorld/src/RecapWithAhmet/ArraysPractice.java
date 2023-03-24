package RecapWithAhmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysPractice {
    /*
    Possible interview questions:
       1-what is the difference between Array and ArrayList
       -->what is ..?
       -->what is the purpose of usage ?
       -->where do we use it?
       -->how do we use it?

    --> Array: Is a storage for Primitives and Objects
    --> The purpose of usage : we can store the data temporarily
    and use it for different purposes. (It is a simple way of storing
    multiple data at the time)

    ArrayList:                                  Array
    1-Dynamic size                              1-Fixed size
    2-Storage for only Object                   2-store Primitives and Object
    3-It doesn't have multidimensional form     3-It does have multidimensional form
    4-It has methods (add,get,size..)           4-It does not have methods but functions
    5-ArrayList can be manipulable              5-It is not manipulable because there is no methods
    6-Syntax is different                       6-Syntax is different
     */
    public static void main(String[]args){

        int[]numbers=new int[5];
        numbers[0]=1; //example of storing primitives into array
        numbers[1]=2;
        String[] names={"Ahmet","Mehmet","Mahmut"}; // example of storing object into array
        int[]numbers2={1,2};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        List mix=new ArrayList();
        mix.add(numbers2[0]); // This is an example of storing only Object
        //numbers2[0] no methods it means this is primitive
        //mix.get(0) // it stores only object
        //numbers2[1].replace
        String.valueOf(numbers2[1]).replace('2','5');

        /*
                ==>Write an implementation that initiliaze int array and find the:
          1-Sum of the even number
          2-SUm of the odd number
          3-Difference between them (the answer shouldn't minus)
          exp: {1,2,3,8,12,65,76,5,22,17} for each:

         */

        int[] array={1,2,3,8,12,65,76,5,22,17};

        int sumOfEvenNumbers=0;
        int sumOfOddNumbers=0;


        for (int number:array){

//            if (number%2==0){
//                sumOfEvenNumbers+=number;
//            }else{ sumOfOddNumbers+=number;}
           int value= (number%2==0) ? (sumOfEvenNumbers+=number) : (sumOfOddNumbers+=number);
           if (number%2==0)
               value=sumOfEvenNumbers;
           else value=sumOfOddNumbers;
        }
        int difference = sumOfEvenNumbers > sumOfOddNumbers ? sumOfEvenNumbers-sumOfOddNumbers:sumOfOddNumbers-sumOfEvenNumbers;
        System.out.println("Sum of the even number: "+sumOfEvenNumbers);
        System.out.println("SUm of the odd number: "+sumOfOddNumbers);
        System.out.println("Difference between them: "+difference);





    }

}
