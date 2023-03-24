package RecapWithAhmet;

public class Exception11 {

    /*

    1-How do you handle exception?
    --> we can handle exception with try and catch, Throws

    2-can you use more than catch block? how about try block?
    -->you can use more than 1 catch block but only one try block

    3-What do you know about final, finalize, finally? (The most common)
        -->Final:Is a keyword to make the variable or method, class unchangeable
    (last version)
        -->Finalize: Is a method to clean up the unused/useless data (Garbage Collector)
        to proof we override the finalize method
        -->Finally: Is a block that comes after try and catch block to do final execution
        no matter what

    4-what is the difference between throw and throws?
        -->Both Throw and Throws are the concept of exception handling in which
        Throws I used to explicity (out of block) throe the exception from a method
        --> public void exception() throws NumberFormatException

        -->public void exception2() {
            new throw NumberFormatException(e);

    **While throws are used next to method signature (OutSide the block)
    **Throw is used inside of the block

     */

    public static void main(String[]args) throws InterruptedException {

        String numbers="$199";

//        System.out.println(numbers);
//        int price=Integer.parseInt(numbers);
//        System.out.println(price);

        try {
            System.out.println(numbers);
            int price=Integer.parseInt(numbers);
            System.out.println(price);
        }catch (NumberFormatException ex1){
            System.out.println("Your price parsing has an Error");
            throw new NumberFormatException();
        }finally {
            System.out.println("Iam finally block");
        }
        Thread.sleep(3000);




    }





}
