package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        //123 looking to sum digits 1+2+3
        int number = 123;
        int digit1= number%10;
        System.out.println("digit1 is "+ digit1);

        //12
        number=number/10;
        int digit2= number%10;
        System.out.println("digit2 is "+ digit2);


        //1
        number=number/10;
        int digit3= number%10;
        System.out.println("digit3 is "+ digit3);

    }
}
