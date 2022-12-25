package loops;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {

        // check if given string is palindrome or not
        // EFE, YAY, Tuesday, civic, level, anna, ...

        /* int a1=0;
        int b1=0;
        char a=str.charAt(a1);
        char b=str.charAt(b1);


        for (a1=0,b1=str.indexOf(str.length());a1<=str.length()&&b1>=str.indexOf(0);a1++,b1--){

            if (a==b){
                System.out.println("Your str is palindrome");
            }else if (a!=b) {

            }

        }

         */


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string");

        String str= input.nextLine();
        String reversedStr="";

        for (int i=str.length()-1;i>=0;i--){

            reversedStr+=str.charAt(i);
        }
            if (str.equals(reversedStr)){

                System.out.println("Your str is palindrome");

            }else {
                System.out.println("Your str is not palindrome");
            }















    }
}
