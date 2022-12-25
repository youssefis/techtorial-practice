package groupProject2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        String firstWord=input.nextLine();
        String secondWord=input.nextLine();
        String bothWords=firstWord+" "+secondWord;
        System.out.println(bothWords);
        int firstCount=bothWords.indexOf(" ");
        System.out.println(firstCount);


    }
}
