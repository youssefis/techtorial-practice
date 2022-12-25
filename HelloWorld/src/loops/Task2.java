package loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        /*
           Using the scanner asks the user to input the min and max
            number. Write a java code that will calculate the sum of
            numbers between the range of min and max and those that
            can only be divided by 3 and 11.
            (min and max numbers are included)
            Example:
                0, 120 -> 33 + 66 + 99 = 198
         */
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter min and max number");
        System.out.println("Please enter the min number first");
        int min=sc.nextInt();
        System.out.println("Please enter the max number");
        int max=sc.nextInt();
        int sum=0;
        System.out.print(min+", "+max+" -> ");
        for (int i=min;i<=max;i++){

            if ((i%3)==0&&(i%11)==0&&i!=min){

                sum=sum+i;
                System.out.print(i+" + ");
            }
        }

        System.out.print(" = "+sum);

 */


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter min and max number");
        System.out.println("Please enter the min number first");
        int min = sc.nextInt();
        System.out.println("Please enter the max number");
        int max = sc.nextInt();

        List<String> result = new ArrayList<>();
        int sum = 0;
        for (int i = min; i <= max; i++) {

            if ((i % 3) == 0 && (i % 11) == 0 && i != 0) {

                result.add(String.valueOf(i));
                sum = sum + i;
            }

        }
        System.out.println(min + " , " + max + " -> " + String.join(" + ", result) + " = " + sum);
    }
}
