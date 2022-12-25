package variables;

public class Practice1 {
    public static void main(String[] args) {
        // I want to add numbers 3, 5, 2 and show the total in the console.
        System.out.println(3+5+2);
        //variables
        int redApples=3;
        int greenApples=5;
        int yellowApples=2;
        // I want to print --> number of Red apples is 3 using line 8
        System.out.println("Number of Red apples is "+redApples);
        //Total Appeles
        int total=redApples+greenApples+yellowApples;
        System.out.println("Total number of apples is "+total);
        //variables for prices for each apple type
        //
        int PriceOfRedApples=2;
        int PriceOfGreenApple=3;
        int PriceOfYellowApples=4;
        int totalPrice=(PriceOfRedApples*redApples)+(PriceOfGreenApple*greenApples)+(PriceOfYellowApples*yellowApples);
        System.out.println("You need to pay "+totalPrice+".00$");


    }
}
