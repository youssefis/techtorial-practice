package ScannerPractice;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double balance=200;
        System.out.println("please enter first deposit amount");
        double firstCheck=scanner.nextDouble();
        balance=balance+firstCheck; //==> balance+=firstCheck
        System.out.println("please enter second deposit amount");
        double secondCheck=scanner.nextDouble();
        balance=balance+secondCheck;
        System.out.println("please enter third deposit amount");
        double thirdCheck=scanner.nextDouble();
        balance=balance+thirdCheck;
        System.out.println("please enter first spent ");
        double firstSpent=scanner.nextDouble();
        balance=balance-firstSpent;
        System.out.println("please enter second spent ");
        double secondSpent=scanner.nextDouble();
        balance=balance-secondSpent;
        System.out.println("your final balance is $"+balance);



    }
}
