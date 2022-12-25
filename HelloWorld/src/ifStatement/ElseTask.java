package ifStatement;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a driver license? ");
        String answer=input.nextLine();

        if (answer.equalsIgnoreCase("Yes")){
            System.out.println("You are good");
        }else {
            System.out.println("DMV is next door please visit");
        }




    }
}
