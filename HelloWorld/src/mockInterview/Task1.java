package mockInterview;

public class Task1 {

    public static void main(String[] args) {

        int a=7;
        int b=3;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a="+a);
        System.out.println("b="+b);

        // swp 2 strings

        String x="Hello";
        String y="Youssef";

        x=x+y; //x=HelloYoussef
        y=x.substring(0,x.length()-y.length()); //x=Youssef
        System.out.println("y= "+y);




    }

}
