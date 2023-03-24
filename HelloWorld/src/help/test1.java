package help;

public class test1 {

    public static void main(String[] args) {

        //hicham
        //123 -> 1+2+3+4+5=15

        //make it work with 7 digits;

        int number=11111;
        int sum=0;

        int digit1=number%10;
        System.out.println("digit1 -> "+digit1);
        number=number/10;
        int digit2=number%10;
        System.out.println("digit2 -> "+digit2);
        number=number/10;
        int digit3=number%10;
        System.out.println("digit3 -> "+digit3);
        number=number/10;
        int digit4=number%10;
        System.out.println("digit4 -> "+digit4);
        number=number/10;
        int digit5=number%10;
        System.out.println("digit5 -> "+digit5);

        sum=digit1+digit2+digit3+digit4+digit5;

        System.out.println(digit1+"+"+digit2+"+"+digit3+"+"+digit4+"+"+digit5+"="+sum);

    }


}
