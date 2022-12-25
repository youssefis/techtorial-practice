package ifStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How much are you spending");
        double amount = input.nextDouble();
        input.nextLine();
        System.out.println("What is your state? ");
        String state= input.nextLine();
        double tax=0;
        if (state.equalsIgnoreCase("TX") || state.equalsIgnoreCase("texas")){
            tax=amount*0.045;
        } else {
            tax=amount*0.10;
        }

        if (amount >= 1000) {
            double discount1 = amount * 0.20;
            amount = amount - discount1 +tax;
            System.out.println("your final payment after 20% discount is: " + amount);

        } else {
            double discount2 = amount * 0.05 +tax;
            amount = amount - discount2;
            System.out.println("your final payment after 5% discount is: " + amount);

        }
    }
}
