package groupProject1;

import java.text.DecimalFormat;

public class Task5 {
    public static void main(String[] args) {
        double quarter=0.25, dime=0.1, nickel=0.05, pennies=0.01;
        double result=5*quarter+4*dime+3*nickel+2*pennies;
        System.out.println("$"+new DecimalFormat("0.00").format(result));
    }
}
