package loops;

import java.util.Scanner;

public class WhilePractice2 {
    public static void main(String[] args) {
        /*
        Print " My age is ..."
        from the age of 18 to 25 (inclusive)
         */
        /* int MyAge=18;
        while (MyAge<=25){
            System.out.println("My age is "+MyAge);
            MyAge++;
           }
         */

        /* int number=30;
        while (number<=45){
            System.out.println(number);
            number++;

         }
*/

        Scanner input=new Scanner(System.in);
        System.out.println("please enter an integer");
        int divisor=1;
        int number2=input.nextInt();
        while (divisor<=number2){
            if (number2%divisor==0) {
                System.out.println(divisor);
            }
            divisor++;
        }

    }
}
