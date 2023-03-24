package help;

import java.util.Locale;

public class test2 {
    public static void main(String[] args) {

        String str= "hicham it engineer";
        String firstLetter=str.substring(0,str.indexOf(" ")+1);
        firstLetter=firstLetter.substring(0,1).toUpperCase()+firstLetter.substring(1);
        System.out.println(firstLetter);
        String secondLetter=str.substring(str.indexOf(" ")+1,str.lastIndexOf(" ")+1);
        secondLetter=secondLetter.substring(0,1).toUpperCase()+secondLetter.substring(1);
        System.out.println(secondLetter);
        String thirdLetter=str.substring(str.lastIndexOf(" ")+1,str.length());
        thirdLetter=thirdLetter.substring(0,1).toUpperCase()+thirdLetter.substring(1);
        System.out.println(thirdLetter);
        str=firstLetter+secondLetter+thirdLetter;
        System.out.println(str);



    }

}
