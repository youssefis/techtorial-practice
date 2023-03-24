package RecapWithAhmet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    /*
    Possible interview questions:
        1-What is wrapper class?
           -->Wrapper Class is a process to convert data into different forms.
        2-How many ways of wrapper classes do you know?
           -->AutoBoxing
            - conversion data from Primitive to Object
           -->UnBoxing
            - conversion data from Object to Primitives

            NOte: the reason we use wrapper classes is to make a conversion of a data into another
            needed format (Parsing, Object..ect).

     */

    public static void main(String[]args){

        int number=10; //Primitive data
    //AUtoBoxing conversion from primitive to object
        List<Integer> numbers=new ArrayList<>();
        numbers.add(number);
        System.out.println(numbers.get(0).hashCode());
        //numbers.get(0).  //Autoboxing happened automatically
        //In last example I just added a primitive into a List
        // And it turned automatically into an object

    //UnBoxing conversion from object to primitive

        String str="12345"; //object
        int exampleNumber=Integer.parseInt(str); //example --> primitive
        System.out.println(exampleNumber+1);



    }

}
