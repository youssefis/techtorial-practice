package stringBuilder;

public class Practice1 {
    // create a program to print uppercase alphabet as a single string

    public static String alphabet(){
        String str="";
        for (char c='A'; c<='Z';c++){

            str+=c;
            System.out.println(str);
        }

        return str;
    }
        // use StringBuilder to print lowercase alphabet

    public static void alphabet2(){
        StringBuilder builder=new StringBuilder();

        for (char c='a';c<='z';c++){

            builder.append(c);

        }
        System.out.println(builder);

    }

    public static void main(String[] args) {

        String str1= alphabet();
        System.out.println(str1.charAt(5));

        StringBuilder builder=new StringBuilder("Sunny");
        System.out.println(builder); //sunny

        StringBuilder builder1=new StringBuilder();
        //builder1 = "Winter"; //compile time error
        builder1.append("Winter");
        System.out.println(builder1);
        builder1.append(" is not having snow for this year");
        System.out.println(builder1);
        builder1.append(" is not having snow for this year");
        System.out.println(builder1);
        System.out.println("==========");
        builder1.append(builder1.append(" **"));
        System.out.println(builder1);

        System.out.println("########################");

        alphabet2();

        System.out.println("########################");

        String a="abc";
        System.out.println(a);
        a="sd";
        System.out.println(a);

        int x=4;
        System.out.println(x);
        x=10;
        System.out.println(x);



    }



}
