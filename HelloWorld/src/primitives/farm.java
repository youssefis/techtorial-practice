package primitives;

import java.text.DecimalFormat;

public class farm {
    public static void main(String[] args) {
        double CowCost=1345.86,ChickenCost=10.99;
        int numberOfCows=15, numberOfChicken=45;
        double totalLegs=(numberOfCows*4)+(numberOfChicken*2);
        double WorthOfAnimals=(numberOfCows*CowCost)+(numberOfChicken*ChickenCost);
        System.out.println(totalLegs);
        System.out.println("The worth of the animals is "+" $"+new DecimalFormat("0.00").format(WorthOfAnimals));




    }

}
