package ifStatement;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        get a single letter from user
        when the letter from the user is:
        "M" or "m" --> it is Monday
        "T" or "t" --> it is either Tuesday or Thursday
        "W" or"w" --> it is Wednesday
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a letter ");

        char letter = input.nextLine().charAt(0);

        if(letter =='M' || letter =='m'){
            System.out.println("It is Monday");
        }
        if(letter =='T' || letter =='t'){
            System.out.println("It is either Tuesday or Thursday");
        }
        if(letter =='W' || letter =='w'){
            System.out.println("It is Wednesday");
        }
        if(letter !='M' && letter !='m'&& letter!='T'&& letter!='t'&& letter!='w'&& letter!='W'){
            System.out.println("The letter you entered is not one of the expected");
        }

    }
}
