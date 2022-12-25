package loops;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {
        /*
        get a positive number from user
        and create a multiplication table for given number for up to 10s
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a positive number");
        int number=input.nextInt();
        int multiplication=1;
        while (multiplication<=10){
            System.out.println(number +" * "+multiplication+" = "+number*multiplication);
            multiplication++;

        }


    }
}
