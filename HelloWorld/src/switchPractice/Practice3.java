package switchPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String args[]){
        /*
        Ask user for their favorite fruit
        - Strawberry, mango, apple, grape, banana.
         If user choose one of the provided fruits show him
         " we have your favorite fruit ..... "
         if not show him
         "sorry ! we do not have your favorite fruit ..."

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("What is your favorite fruit ? ");
        String answer=sc.nextLine().toUpperCase();
        switch (answer){
            case "STRAWBERRY" :
            case "MANGO" :
            case "APPLE" :
            case "GRAPE" :
            case "BANANA" :
                System.out.println("we have your favorite fruit "+ answer);
                break;
            default:
                System.out.println("sorry ! we do not have your favorite fruit "+ answer);





        }

    }
}
