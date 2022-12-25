package primitives;

public class ComparisonOperator1 {
    public static void main(String[] args) {
        //==
        int a=4, b=4;
        System.out.println(a==b);// true
        boolean result1= a==a;
        System.out.println(result1);//true

        System.out.println(result1==true);//true
        boolean result2= ++a ==2+3;
        System.out.println(result2); //true
        System.out.println(7==8);

        // != Not equal

        int num1=6, num2=6;
        boolean result3=num1!=num2;
        System.out.println(result3);//false
        System.out.println(num1!=2); //true

        char letter= '9';
        System.out.println(letter!=9); //true

        char letter2='A';
        System.out.println(letter2!=65);//false

        System.out.println(letter2==65);//true

        // > greater than
        System.out.println(0>1);  //false

        boolean result4 = 0>1;

        System.out.println(result4); // false
        System.out.println((10*2)>(9+10)); //true
        System.out.println('A'>'a');  // 65>97 ==> FALSE

        // <--- less than

        System.out.println(67<98); //true

        double d1=1.25, d2=12.5;
        boolean result5=d1<d2;
        System.out.println(result4!=result5); //true
        System.out.println("======================");
        // >= greater than or equal to

        System.out.println(7>=7); //true

        int count=34;
        count+=count;

        int count2 = count +count; // ---> count= count + count;


        boolean result6= count>=count2;
        System.out.println("Result is "+result6); //false

        //  <= -- Less than OR equals

        System.out.println(4<=8); // true
        System.out.println(6<=6); //true
        System.out.println(9<=8); //false
        System.out.println('a'<='b');//true
        System.out.println("hi" == "bye"); //
        System.out.println("hi" == "hi"); //
        System.out.println("hi" != "hi"); //

        // s

















    }
}
