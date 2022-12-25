package groupProject2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int givenNumber=input.nextInt();
        int firstNumber=givenNumber%10;
        int secondNumber=(givenNumber%100)/10;
        int thirdNumber=(givenNumber%1000)/100;
        int forthNumber=(givenNumber%10000)/1000;
        int fifthNumber=(givenNumber%100000)/10000;
        int sixthNumber=(givenNumber%1000000)/100000;
        int multiplicationOfAllDigits=sixthNumber*fifthNumber*forthNumber*thirdNumber*secondNumber*firstNumber;
        int sumOfAllDigits=sixthNumber+fifthNumber+forthNumber+thirdNumber+secondNumber+firstNumber;
        System.out.println("multiplication of all digits is: "+multiplicationOfAllDigits);
        System.out.println("sum of all digits is: "+ sumOfAllDigits);






    /*    System.out.println(firstNumber);
        System.out.println(secondtNumber/10);
        System.out.println(thirdNumber/100);
        System.out.println(forthNumber/1000);
        System.out.println(fifthNumber/10000);
        System.out.println(sixthNumber/100000);
    */

    }
}
