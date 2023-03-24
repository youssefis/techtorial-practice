package stringBuilder;

public class Practice2 {

    public static void main(String[] args) {

        StringBuilder builder=new StringBuilder();
        builder.append("January");

        System.out.println(builder.substring(3));

        Character ch= builder.charAt(0);
        System.out.println(ch);

        Integer i=builder.indexOf("y");
        System.out.println(i);

        String part= builder.substring(3);

        //put substring into a new StringBuilder object

        StringBuilder b2 =new StringBuilder(builder.substring(3));

        // StringBuilder b3=builder.substring(2); compile time error

        // replace() --> we should provide starting and ending index and replacement value as text
        builder.replace(1,4,"$$$");
        System.out.println(builder);

        builder=builder.replace(1,2,"**");
        System.out.println(builder);




    }

}
