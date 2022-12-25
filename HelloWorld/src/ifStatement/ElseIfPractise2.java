package ifStatement;

import java.util.Scanner;

public class ElseIfPractise2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pleas enter an integer");
        int number=input.nextInt();

        if (number>0) {
            System.out.println("Your number is Positive");

        } else if (number<0) {
            System.out.println("Your number is Negative");

        }else {
            System.out.println("Your number must be Zero");
        }
    }
}
