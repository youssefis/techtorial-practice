package ifStatement;

public class Practice1 {
    public static void main(String[] args) {

        int money=100;
        int item$=250;
        System.out.println("First print BEFORE if statement");
        if(money>item$){

            System.out.println("you are buying the Item");

        }
        System.out.println("another print AFTER if Statement");
        int item2$ = 99;

        if(money>item2$){
            System.out.println("i can buy item2");

        //you have another option as using your credit card if the money is not enough

        boolean creditCard=true;

        if (money>item$ || creditCard== true){
            System.out.println("you are using 2 different option to buy item");


        }






        }
    }
}
