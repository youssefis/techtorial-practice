package loops;

import java.util.Scanner;

public class WhilePractice6 {
    public static void main(String[] args) {
        //print out every letter from a given string by separating them with dash
        //Example: Television  --> T-e-l-e-v-i-s-i-o-n
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string");
        String str= input.nextLine();
        int stringLength=str.length();
        int number=0;
        while (number<=stringLength-1){
            if (number==stringLength-1){
                System.out.print(str.charAt(number));

            }else {
                System.out.print(str.charAt(number)+"-");
            }
            number++;

        }
    }
}
