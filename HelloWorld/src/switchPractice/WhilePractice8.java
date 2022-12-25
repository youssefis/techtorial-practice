package switchPractice;

public class WhilePractice8 {
    public static void main(String[] args) {

        // find the sum of even numbers between 1 and 15

        int num1=1, num2=15, sum=0;
        while (num1<=num2){
                if (num1%2==0) {
                sum = sum + num1;
            }
            num1++;
        }
        System.out.println(sum);
    }
}
