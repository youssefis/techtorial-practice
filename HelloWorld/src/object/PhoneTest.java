package object;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("what shape of phone are you looking for?");
        String answer=input.next();

    Phone phone1=new Phone(answer,"blue",799,true);
        System.out.println("rectangle".equalsIgnoreCase(phone1.shape));
        phone1.call(123);
        // create a method to check price of phone
        // if the price is under my budget, i will buy it
        double budget=1000;
        System.out.println(budget> phone1.price);

        priceCheck(phone1,budget);

    }
    public static void priceCheck(Phone phone,double limit){

        if (phone.price<limit){

            System.out.println("this is in your budget: "+phone.color);

        }

    }

}
