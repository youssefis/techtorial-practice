package RecapWithAhmet;

import java.util.Scanner;

public class IfAndTernary {

    /*
    Possible interview questions:
        1- Most of the technical questions are required if condition.

        if is a conditional statement
            if(condition){
            Implementation
            }else{Implementation}

            if(condition){
            else if(condition)
            else{}

            AND (&)                                OR (||)
            True & True --> True            True || True --> True
            False & False --> False         True || False --> True
            True & False --> False          False || False --> False
     */

    public static void main(String[] args) {
        /*
      -10 to 0 -> freezing
       0 to 25 -> normal
       25 to 50 -> hot

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the actual temperature btw -10 and 50");
        int actualTemperature=scanner.nextInt();
        if(actualTemperature<0 && actualTemperature>-10){
            System.out.println("It is freezing");
        }else if (actualTemperature>=0 && actualTemperature<25){
            System.out.println("It is normal");
        }else if(actualTemperature>=25 && actualTemperature<50){
            System.out.println("It is hot");
        }else {
            System.out.println("the input is not applied for the condition, please check.");
        }
        boolean result=actualTemperature>10 || actualTemperature<5;
        System.out.println(result);

        //Ternary Operators condition ? value1 : value2; if condition is true =>value1, False=> value 2;

        String name="Ahmet";
        String name2="ahmet";
        String result2=name2.equalsIgnoreCase(name) ? "The values are matching" : "The values are not matching";
        System.out.println(result2);







    }

}
