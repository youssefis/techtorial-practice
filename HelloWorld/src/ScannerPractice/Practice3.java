package ScannerPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // we will figure out initials of a person
        //Youssef ElHoussaini --> Initials --> YE

        System.out.println("please enter your first name");
        // to take string data, nextLine() or next()
        char firstInitial=scanner.nextLine().charAt(0);
        //last name
        System.out.println("please enter your last name");
        char lastInitial=scanner.nextLine().charAt(0);
        System.out.println(" "+firstInitial+lastInitial);
    }
}
