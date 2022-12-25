package groupProject2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int givenNumber=sc.nextInt();
        int firstNumber=givenNumber%10;
        int secondNumber=(givenNumber%100)/10;
        int thirdNumber=(givenNumber%1000)/100;
        int forthNumber=(givenNumber%10000)/1000;
        int fifthNumber=(givenNumber%100000)/10000;
        System.out.println("Reversed number: "+ firstNumber+secondNumber+thirdNumber+forthNumber+fifthNumber);
    }
}
