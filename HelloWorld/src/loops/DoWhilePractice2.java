package loops;

import java.util.Scanner;

public class DoWhilePractice2 {
    public static void main(String[] args) {

        // Use Do while to solve
        /*
        get two positive integer from user and find the sum of the range
        using Do while,
        2, 7 --> 3+4+5+6= 18
         */

        Scanner input=new Scanner(System.in);
        System.out.println("please enter first integer");
        int num1=input.nextInt();
        num1=num1+1;
        System.out.println("please enter second integer");
        int num2=input.nextInt(),sum=0;
        do {
            sum=sum+num1;
            num1++;
        }while (num1<num2);
        System.out.println(sum);
    }
}
