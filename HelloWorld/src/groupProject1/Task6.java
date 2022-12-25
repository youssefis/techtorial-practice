package groupProject1;

import java.text.DecimalFormat;

public class Task6 {
    public static void main(String[]args){
        double balance=2.36;
        System.out.println(balance+" will make");
        double numberOfQ= (balance/0.25);
        int Q= (int)numberOfQ;
        System.out.println(Q+" Quarters");
        balance-=Q*0.25;

        double numberOfD= balance/0.1;
        int D=(int)numberOfD;
        System.out.println(D+" Dime");
        balance-=D*0.1;

        double numberOfN=balance/0.05;
        int N=(int)numberOfN;
        System.out.println(N+" Nickels");
        balance-=N*0.05;

        double numberOfP=balance/0.01;
        System.out.println(new DecimalFormat("0").format(numberOfP)+" Pennies");









    }
}
