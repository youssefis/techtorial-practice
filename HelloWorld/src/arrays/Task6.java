package arrays;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str=input.nextLine();
        String newStr="";
        for (int i=0;i<str.length();i++){
            char letter=str.charAt(i);
        if(i!=0&&letter>='A'&&letter<='Z'){

            newStr+=" "+letter;
        }else {
            newStr+=letter;
        }

        }
        System.out.println(newStr);

    }
}
