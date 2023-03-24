package RecapWithAhmet;

import java.util.Arrays;

public class StringAndMethods {
    /*
    Possible interview Questions:
     1-> most of the technical questions are related to String and its method
     2-> what is the difference between (.equals) and (==)
        String (.equals) --> used to compare two values
        String (==) -->
        Ex:
            String name="AHMET";
            String anotherName=new String ("AHMET")
            sout(name.equals(anotherName));
            sout(name==anotherName);
     3-> what is String and how do you declare
        - General Description
            * String is an object that used to store some data
        -You can go deep
        -String has some specific methods that we use for any purposes like comparison.
        -I can declare a string by two ways:
            1-
             String str: Declaring a string variable without assigning any value
             String str1= "AHMET": initialization means when we create a variable
             with assigning a value to it.
            2-
             String str2= new String(); Declaration
             String str3= new String("Ahmet") initialization;

    4-String methods: * it is really important not only for technical but also automation
        1- IndexOf() --> it returns the index number of a given character as an int
        2- Length() --> it returns the number of characters as an int including the white space
        3- Concat() --> it returns a new String that is the result of combining two or more given strings
        4- split() -->  it splits a string into an array of substrings based on a given delimiter
        the delimiter.
        5- startWith()--> it return a boolean true or false based on if the string starts with the
        given parameter
        6- EndsWith() --> it return a boolean true or false based on if the string ends with the
        given parameter
        7- SubString()--> it returns subString of the original String based on two given int which are
        the start index and the end index
        8- CharAt() --> it returns a character at given index
        9- contains() --> it returns a boolean, it checks if a string contains another string it returns
        true if yes or false otherwise
        10- TRIM() --> it removes spaces from the beginning and the end of a string
        11-Replace()--> it replaces the specific character/words in String it returns String
        12-Equals() --> it compares two values of variable. it returns boolean
        13-EqualIgnoreCase() -->it compares two values of variable without case sensitivity.
        14-ValueOf() --> it converts the different data type to string type it return String
        15-ToUpperCase/ToLowerCase -->it returns the upper case or the lower case form of the given String






        Tips: once you are explaining anything in IT:
            1- use IT Terminology --> declare, initialize ect..
            2- explain from general to deep
     */



    public static void main(String [] args){

//        String name="AHMET";
//        String anotherName=new String ("AHMET");
//        System.out.println(name.equals(anotherName)); //True
//        System.out.println(name==anotherName); //False
//        System.out.println(name.hashCode());
//        System.out.println(anotherName.hashCode());

        String str="Ahmet Loves Java";
        String str1=new String("Ahmet Loves Java");
        String str2="Ahmet Loves Java";
        String str3=new String("Ahmet Loves Java");
        System.out.println(str.equals(str1)); // true //comparing only values
        System.out.println(str1==str3); // false //comparing values and location
        System.out.println(str==str2); // true //both str and str2 are under String pool

        System.out.println(str.indexOf("t")); //4
        System.out.println(str.length()); //16
        System.out.println(str.concat(" "+str2)); //
        String[] words= str.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(Arrays.toString(words));

        //String str2="Ahmet Loves Java";
        str2=str2.replace("Ahmet","ahmet"); // String is immutable,
        System.out.println(str2.startsWith("Ahmet"));   //false
        System.out.println(str2.startsWith("Va"));      //false

        char character=str2.charAt(3);
        String SbStr=str2.substring(3,4);
        System.out.println(character);
        System.out.println(SbStr.toUpperCase());
        System.out.println(SbStr.toLowerCase());
        String exp="Hello Guys";
        String exp2="hello guys";
        System.out.println(exp2.equalsIgnoreCase(exp));
        int number=5;
        int number2=3; //53

        String bucket=String.valueOf(number)+String.valueOf(number2);
        System.out.println(bucket);

        boolean result=str2.contains("av"); //str2="Ahmet Loves Java"
        System.out.println(result);

        String lastExample= " We are completing String".trim();
        String lastExample2= "We are completing String";
        System.out.println(lastExample.equals(lastExample2));


    }
}
