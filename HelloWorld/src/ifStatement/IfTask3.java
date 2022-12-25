package ifStatement;

import java.util.Scanner;

public class IfTask3 {
    public static void main(String[] args) {

        /*
        figure out if a number is even or odd number
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Pleas enter an int number");

        int number=input.nextInt();

        if (number%2==0){
            System.out.println("Your number is Even");
        }else {
            System.out.println("Your number is Odd");
        }

    }
}
