package stringBasics;

public class StringMethod4Trim {
    public static void main(String[] args) {
        String str2= "       today is        so quite";

        String result = str2.trim();
        System.out.println(result);
        int number =str2.trim().replace('t','T').substring(2,8).length();
        System.out.println(number);
        // String quote = " From zero to Hero " ;

        /*
            replace zero with 'one'
            make entire string as uppercase
            remove ALL spaces
            get a three letters substring from the end
            print our whatever you have left with

         */

        String quote="From zero to hero";
        String result2=quote.replace("zero","one").toUpperCase().trim().replace(" ","");
        String result3=result2.substring(quote.length()-3);
        System.out.println(result3); //ERO





    }
}
