package loops;

import java.util.Scanner;

public class Task3 {

    /*
            Ask the user to enter one number between 1 and 10 then, Write the
        program to print the string in the following format:
        Search to see what happens when you multiply the string with
        numbers and use it for solving this question.
        Example:
        Input: 5
        Output:
        1
        22
        333
        4444
        55555
     */


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int number=sc.nextInt(); //5
        for (int i =1;i<=number;i++){

            for (int k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }






    }
}
