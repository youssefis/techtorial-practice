package ternary;

public class Practice1 {
    public static void main(String[] args) {

        // boolean condition ? value1 : value2 ;
        int a=16, b=7;
        int result= a<b ? a+b : a*b;
        System.out.println(result);

        String result1= a!=b ? "addition" : "multiplication";
        System.out.println(result1);
        System.out.println(a>=b+9 ? 'c':"check" ); // since data type are different we can not store them
        String str1 ="I'm so lucky";
        String str2= "It's going great";
        String day="Sunday";
        System.out.println(day.equals("Monday")? str2:str1);
        System.out.println("a-->"+a);
        System.out.println("b-->"+b);
        System.out.println(a>b ? ++a + ++b : --a + --b);
        //nested ternary
        System.out.println("a: --->"+ ++a);
        System.out.println("a: --->"+ ++a);
        System.out.println("a: --->"+ a++);
        System.out.println("a: --->"+ a);

    }
}
