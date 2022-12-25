package groupProject2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter X");
        int x= input.nextInt();
        System.out.println("Enter Y");
        int y= input.nextInt();

        System.out.println("x= "+x);
        System.out.println("Y= "+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("---------");

        System.out.println("x= "+x);
        System.out.println("y= "+y);





    }
}
