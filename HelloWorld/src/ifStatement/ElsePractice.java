package ifStatement;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {

        int money = 100;
        //if your money is more than $100 you can get an item

        if (money > 100) {
            System.out.println("I can buy an item");

        } else {
            System.out.println("I can not buy anything");
        }
        System.out.println("================");
        money=101;
        if (money>100){
            System.out.println("I can buy");
        }else {
            System.out.println("I can not buy");
        }





    }
}
