package object;

public class MethodPractice1 {
    // create a method that will add two integer numbers and return the sum

    public int sumCalculator(int num1, int num2){
        int sum=num1+num2;
        System.out.println("two int parameter method is running");
        return sum;
        // or return num1+num2;
    }
    public int sumCalculator(int num1, int num2, int num3){
        int sum=num1+num2+num3;
        System.out.println("three int parameter method is running");
        return sum;
        // or return num1+num2+num3;
    }
    public int sumCalculator(int[] numbers){
            int sum=0;
        for (int num:numbers){
            sum=sum+num;
        }
        return sum;
    }

    public static void main(String[] Args){

        MethodPractice1 object=new MethodPractice1();
        int sum1=object.sumCalculator(3,5);
        System.out.println(">>>>>>>>>>>>> "+sum1);

        object.sumCalculator(3,34,11);
        int sum2=object.sumCalculator(3,34,11);
        System.out.println(">>>>>>>>>>>>>"+sum2);
        System.out.println("-----------------------");
        int[] arr = {2,1,7,10,5};
        int total =object.sumCalculator(arr);
        System.out.println(total);
        System.out.println(object.sumCalculator(new int[]{1,2,3,5,4,11}));

    }

    // overLoad sumCalculator method to find sum of numbers from a given array







}
