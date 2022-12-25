package ifStatement;

import java.util.Scanner;

public class NestedIfTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your city?");
        String city = input.nextLine();
        if (city.equalsIgnoreCase("chicago")) {
            System.out.println("What is your school name? ");
            String school = input.nextLine();
            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky! ");
            } else {
                System.out.println("Please come and visit techtorial");
            }
        }
        if (city.equalsIgnoreCase("miami")) {
            System.out.println("What is your school name?");
            String school = input.nextLine();
            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky! ");
            } else {
                System.out.println("Please come and visit techtorial");

            }
        }
    }
}