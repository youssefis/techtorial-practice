package exceptions;

public class Practice3 {

    // create a method
    // this method have some implementation
    //there will be a type of exception in your logic
    //handle that exception with try-catch blocks

    public static void division(String str){

        try {
            String reversed="";
            for (int i=str.length();i>=0;i--){

                reversed+=str.charAt(i);
            }
            System.out.println(reversed);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Catch");
        }finally {
            System.out.println("Finally Block");
        }

    }

    public static void main(String[] args) {
        System.out.println("First Line");
       division("youssef");
        System.out.println("After method Call");


    }

}
