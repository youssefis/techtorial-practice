package loops;

public class WhilePractice7 {
    public static void main(String[] args) {
        /*
        find the sum of numbers between 10 and 15
        10+11+12+13+14+15=75
         */
        int number1 = 10, number2 = 15, sum=0;
        while (number1 <= number2) {
            if (number1 < number2) {
                System.out.print(number1 + "+");
            } else {
                System.out.print(number2);
                System.out.print("=");
            }
            sum=sum+number1;
            number1++;

        }
        System.out.print(sum);
    }
}
