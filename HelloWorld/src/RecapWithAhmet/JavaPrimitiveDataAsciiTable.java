package RecapWithAhmet;

public class JavaPrimitiveDataAsciiTable {
    /*
    Possible Interview Questions
        1-what is java what do you know about JDK, JVM, JRE?

        JAVA: is general purpose, oriented programing language developed by
        sun microsystems

        JDK: stands for java development kit, that has some libraries and
        the necessary tools for developing java application

        JRE: stands for java run time environment, it is a set of software
        tools used for running java programs

        JVM: stands for java virtual machine, it is responsible for converting
        bytecode to machine specific code

        Primitive Data: ( * : usage )
           -Whole numbers       -Decimal numbers    -condition      -Character
            *Byte                *Float              *Boolean        *char
            *Short               *Double ***
            *int ***
            *long *

         ASCII Table: it is a table for the characters, can be used to look up
         the numeric value of a character or to look up the character of a
         given value

     */

    public static void main(String[] args){

        Short a=5;
        Short b=6;
        Short c= (short)(a+b-2);
        System.out.println(c);

        char letter=65;
        char letter2='g';
        int num='g';
        System.out.println(num); //103
        System.out.println(letter2-letter); // 103-65 -->38
        System.out.println(letter2); // g
        System.out.println(letter);  // A

        int num1=5;
        int num2=21;

        boolean cond1=num1>num2;
        boolean cond2=num2>num1;
        System.out.println(cond1); //False
        System.out.println(cond2); //True

        double amount=24.5d;
        double amount2=0.235545454;

        System.out.println(amount2);
        System.out.println(amount);
        System.out.println(amount+amount2);

        int sum= (int) (amount+amount2);
        System.out.println(sum);



    }

}
