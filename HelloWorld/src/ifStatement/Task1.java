package ifStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Ask the user to give you an integer number between 1 and 5
        // print out day name for related number
            /*
            1-->mon
            2-->tue
            3-->wed
            4-->thur
            5-->fri
             */
        Scanner input=new Scanner (System.in);
        System.out.println("please enter an int number between 1 and 5");
        int number=input.nextInt();

        if (number==1){
            System.out.println("It is monday");
        }
        if (number==2){
            System.out.println("It is tue");
        }
        if (number==3){
            System.out.println("It is wed");
        }
        if (number==4){
            System.out.println("It is thu");
        }
        if (number==5){
            System.out.println("It is fri");
        }
        if (number>5 || number<1){
            System.out.println("There is no matching day");
        }

        // task
        /*
        get a string from user
        - check if the given string starts with letter 'h'
        and the length of the string is more than 10
        -print ---> "This is what i am looking for"
         */
        System.out.println("please enter a text");
        input.nextLine();
        String str=input.nextLine();
        if(str.startsWith("h") && str.length()>10){
            System.out.println("This is what i am looking for");


        }







    }

}
