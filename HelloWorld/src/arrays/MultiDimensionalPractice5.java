package arrays;

public class MultiDimensionalPractice5 {
    public static void main(String[] args) {
        String brands[][]={{"Apple","Dell","Google","Acer","Samsung"},{"LG","Sony","Toshiba"},{"Google","Bose","JBL"}};
        double prices[][]={{2500,1800,400,1399,1550.99},{1100,800,599},{99.99,120.99,89.95}};
        // "JBL is 89.95"


        for (int i=0;i<brands.length;i++){

            for (int j=0;j<brands[i].length;j++){

               // System.out.println(brands[i][j]+" is $"+prices[i][j]);
                if(brands[i][j].equalsIgnoreCase("google")&&prices[i][j]<100){

                    System.out.println(brands[i][j]+" is $"+prices[i][j]);

                }

            }

        }

        //show google product that cost less than 100






        /*
        for (String brand[]:brands){
            for (String nameOfBrand:brand){
                System.out.println(nameOfBrand);
            }
        }
        for (double price[]:prices){
            for (double priceOfEach:price){
                System.out.println(priceOfEach);
            }
        }
        */
    }
}
