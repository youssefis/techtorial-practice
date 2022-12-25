package stringBasics;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {

        /*TASK: get a string from User via scanner and:
        -print:
        - first char
        - last char
        - index of second matching letter 'c'
                - lenght of string
        - index of x
        - middle char
        */

        Scanner input=new Scanner(System.in);
        System.out.println("please enter a String value");
        String useStr=input.nextLine();
        System.out.println(useStr.charAt(0)); //first char
        System.out.println(useStr.charAt(useStr.length()-1)); //last char
        System.out.println(useStr.indexOf('c',useStr.indexOf('c')+1)); //second 'c' index number
        System.out.println(useStr.length()); //length
        System.out.println(useStr.indexOf('x')); // index of 'x'
        System.out.println(useStr.length()/2);//middle char
    }
}
