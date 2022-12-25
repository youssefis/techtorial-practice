package ScannerPractice;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        //=====BodyMassIndex=====
        // BMI= weight(kg)/ (height(m)*height(m);>>18-24
        Scanner scanner= new Scanner(System.in);
        System.out.println("we are about to calculate BMI for you,please enter your weight in kgs");
        double weight= scanner.nextDouble();
        System.out.println("enter your height in meters plz");
        double height= scanner.nextDouble();

        double bmi= weight/(height*height);
        System.out.println("your BMI result is: "+ bmi);
    }
}
