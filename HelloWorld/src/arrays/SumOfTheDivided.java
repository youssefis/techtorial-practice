package arrays;

import java.util.Scanner;

public class SumOfTheDivided {
    public static final int MAX_LENGTH = 1000;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter min and max number");
        System.out.println("Please enter the min number first");
        int min = sc.nextInt();
        System.out.println("Please enter the max number");
        int max = sc.nextInt();

        int result[]=new int[MAX_LENGTH];
    }
}
