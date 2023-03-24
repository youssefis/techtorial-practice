package RecapWithAhmet;

public class MultiDimensionalArray {

    /*
    There is no specific question regarding that, other than difference between
    array and arrayList.
    ->In automation i will give you more details regarding how to use.
     */

    public static void main(String[]args){
        try {
            String[][]names={{"Ahmet","hello"},{"Mehmet"},{"Mahmut"},{"Ahmet","Mehmet","Mahmut"}};
            System.out.println(names[0][0]); //Ahmet
            System.out.println(names[1][0]); //Mehmet
            System.out.println(names[0][3]); //ArrayIndexOutOfBoundsException
            System.out.println(names[3][2]); //Mahmut
        }catch (Exception e){
            System.out.println( e.getMessage());
        }

        System.out.println("it works");

        //Recap Of Recap
        /*
        -Arrays: is a bucket or storage for primitives and objects.
            -->Fixed, multidimensional, it has only one function(length) ..ect
            -->...


         */


    }

}
