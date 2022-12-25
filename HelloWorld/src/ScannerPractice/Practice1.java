package ScannerPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[]args){
        // print my first name
        String firstName="Youssef";
        System.out.println("My first name is: "+ firstName);

        // let's get last name from user and print it by using Scanner Class ----> "My last name is: .."

        Scanner scanner= new Scanner(System.in);


        String lastName=  scanner.nextLine();
        //System.out.println(lastName);
        System.out.println("My last name is: "+ lastName);
        // get name of the city from user and say "youssef el houssaini , you are living in .."

        String city=scanner.nextLine();
        System.out.println(firstName+" "+" "+lastName+" "+"you are living in "+ city);
    }
}
