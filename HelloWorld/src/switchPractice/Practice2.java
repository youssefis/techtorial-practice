package switchPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        get an integer number from user
        if the number is 1 ---> "It is IT department"
        if the number is 2 ---> "It is HR department"
        if the number is 3 ---> "It is Help desk department"
        if the number is 4 ---> "It is Accounting department"
        cover for invalid choice as well
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please choose a number from 1 to 4");
        int userEntry= sc.nextInt();
        switch (userEntry) {
            case 1:
                System.out.println("It is IT department");
                break;
            case 2:
                System.out.println("It is HR department");
                break;
            case 3:
                System.out.println("It is Help desk");
                break;
            case 4:
                System.out.println("It is Accounting");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }

    }
}
