package loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        you/user have $100
        ask the user how much is the spending amount
        - if the spending amount is less than balance let the user know that he/she can spend more
        - if the spending amount greater than the balance --> "you do not hav enough money to spend"
         */
        /*Scanner input=new Scanner(System.in);
        int userBalance= 100;
        System.out.println("you have $"+userBalance+" How much do you want to spend");
        int spent= input.nextInt();
        while (userBalance>=0){
            userBalance=userBalance-spent;
            if (userBalance>=0){
                System.out.println("Your balance is $"+(userBalance-spent)+" How much do you want to spend");
            }else {
                System.out.println("you do not have enough money.");
            }

            }
         */
        Scanner input=new Scanner(System.in);
        int balance=100;
        System.out.println("you have $"+balance+" How much do you want to spend");
        int spend=input.nextInt();

        while (balance>=0){
            balance=balance-spend;
            if (balance>=0){
                System.out.println("Your balance is $"+balance+" How much do you want to spend");
                spend=input.nextInt();
            }else {
                System.out.println("you do not have enough money.");
            }

        }






    }
}
