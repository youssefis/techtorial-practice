package loops;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a sentence that is not separated by space and each word\n" +
                "starts with upper case.");
        String sentence= input.nextLine();
        String str="";
        for (int i=0;i<sentence.length();i++){

            if (i!=0&&sentence.charAt(i)>='A'&&sentence.charAt(i)<='Z'){
                str+=" "+sentence.charAt(i);
            }else {
                str+=sentence.charAt(i);
            }

        }
        System.out.println(str);
    }
}
