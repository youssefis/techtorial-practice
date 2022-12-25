package groupProject2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter first number");
        int firstNumber=input.nextInt();
        System.out.println("please enter second number");
        int secondNumber=input.nextInt();
        int multiplication=firstNumber*secondNumber;
        System.out.println("Output : "+multiplication);
    }
}
