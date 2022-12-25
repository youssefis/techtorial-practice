package loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 10");
        int num=input.nextInt();

        for (int i=num ;i>=1 ;i-- ){

            for (int k=1;k<=i;k++){

                System.out.print(i);

            }
            System.out.println();
        }

    }
}
