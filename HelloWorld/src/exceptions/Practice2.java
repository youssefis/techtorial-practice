package exceptions;

public class Practice2 {

    public static void main(String[] args) {


        try {
            System.out.println("------First-----");
            String str="B15";

            int result=15/0; //ArithmeticException

            System.out.println("--------Second--------");

            int number = Integer.parseInt(str); // NumberFormatException

            System.out.println("--------Third----------");
        }catch (ArithmeticException  e){
            System.out.println("CATCH");
        }catch (NumberFormatException e1){
            System.out.println("CATCH2");
        }

        try {
            String str ="Last";
            String reversed="";
            for (int i=str.length()-1;i>=0;i--){

                reversed+=str.charAt(i);
            }
            System.out.println(reversed);
        }catch (StringIndexOutOfBoundsException e3){
            System.out.println(e3.getMessage());
        }
        System.out.println("*******");
    }

}
