package mentringTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    /*
    Create a class named ‘Student’ with String variable
    ‘name’ and integer variable ‘roll_no’.
    Assign the value of roll_no as ‘2’ and that of name
    as “John” by creating an object of the class Student.
     */

    String name;
    int roll_no;

    /*
        Write a Java method to find the smallest number among three numbers
     */

    public void sFinder(int a,int b,int c,int d,int e,int f,int g,int h){
    // 2 4 8
        int[] numbers = {a,b,c,d,e,f,g,h};

        int result=Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<result)
                result=numbers[i];
        }
        System.out.println(result);
    }



    public static void main(String[] args) {

        Student object= new Student();
        object.name="John";
        object.roll_no=2;


        object.sFinder(13,9,333,99,1,99,77,6);








    }

}
