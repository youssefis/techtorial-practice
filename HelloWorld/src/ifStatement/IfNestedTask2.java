package ifStatement;

import java.util.Scanner;

public class IfNestedTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you know java? yes/no ");
        String java = sc.nextLine();
        if (java.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium? yes/no ");
            String selenium = sc.nextLine();
            if (selenium.equalsIgnoreCase("yes")) {
                System.out.println("Do you know API testing yes/no");
                String api = sc.nextLine();
                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL yes/no");
                    String sql = sc.nextLine();
                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("You are hired!");

                    } else {
                        System.out.println("we are looking for somebody who knows SQL");
                    }

                } else {
                    System.out.println("we are looking for somebody who knows API");

                }
            } else {
                System.out.println("we are looking for somebody who knows selenium");
            }


        }else {
            System.out.println("we are looking for somebody who knows java");
        }

    }
}