package ifStatement;

import java.util.Scanner;

public class IfTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Average");
        int average = input.nextInt();
        if (average >= 60 && average <= 69) {
            System.out.println("Your score id D");
        }
        if (average >= 70 && average <= 79) {
            System.out.println("Your score id C");
        }
        if (average >= 80 && average <= 89) {
            System.out.println("Your score id B");
        }
        if (average >= 90 && average <= 100) {
            System.out.println("Your score id A");
        } else {
            System.out.println("Please come again");
        }
    }
}
