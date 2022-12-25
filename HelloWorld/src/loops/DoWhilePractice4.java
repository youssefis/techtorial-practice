package loops;

public class DoWhilePractice4 {
    public static void main(String[] args) {

        /*
        String str = "@$%SdvH&S345"
        count the number of letters --> letters count -->5
        count the number of digits --> digits count --> 3
        count the number of other symbols --> symbols count --> 4

        System.out.println("letters count --> "+lettersCount);
        System.out.println("digits count --> "+digitsCount);
        System.out.println("symbols count --> "+symbolsCount);

         */

        String str = "@$%SdvH&S345";
        int indexNumber=0,lettersCount=0,digitsCount=0,symbolsCount=0;
        do {
            char ch=str.charAt(indexNumber);
            if ( ch>='a'&& ch<='z' || ch>='A'&&ch<='Z'){
                lettersCount++;
            } else if (ch>='0'&&ch<='9') {
                digitsCount++;
            }else {
                symbolsCount++;
            }
            indexNumber++;
        }while (indexNumber<str.length());
        System.out.println("letters count --> "+lettersCount);
        System.out.println("digits count --> "+digitsCount);
        System.out.println("symbols count --> "+symbolsCount);

        //=====================================================================

        // String sentence = "I can do it on my own this time"
        // find letters 'o' and 'O' and count them

        String str2= "I can do it on my own this time";
        int oCounts=0, indexNumber2=0;
        do {
            char ch2= str2.charAt(indexNumber2);
            if (ch2=='o'|| ch2=='O') {
              oCounts++;
            }
            indexNumber2++;
        }while (indexNumber2<str2.length());
        System.out.println("O and o counts --> "+oCounts);


    }
}
