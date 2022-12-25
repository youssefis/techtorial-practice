package loops;

import java.util.Scanner;

public class DoWhilePractice3 {
    public static void main(String[] args) {
        /*
        get a positive number from user
        for that given number, create star tree like following,
        --- user input: 5 -->
            *
            **
            ***
            ****
            *****
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int num=input.nextInt();
        String str="*";

        do {
            System.out.println(str);
            str=str.concat("*");
            num--;
        }while (num>0);


    }
}
