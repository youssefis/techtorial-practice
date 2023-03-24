package ScannerPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);

        System.out.println("How is the weather this morning?");

        String answer= imput.nextLine();
        System.out.println("what is todays name?");
        // ask user for the name of the day
        // store the name of the day
        // pint a message as : "So, it is a rainy the day name"
        String day= imput.nextLine();
        System.out.println("what city?");
        String city= imput.nextLine();

        System.out.println("So it is a " +" "+ answer+" "+ day +" in "+city);

        // ask user for the zipcode, store it, and double check with user by printing back

        System.out.println("what is your zip code");

        int zipcode = imput.nextInt();
        System.out.println("Is this correct zip code");
        //




    }
}
