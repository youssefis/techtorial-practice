package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // ask user how many chocolate names s/he wants to store in an array
        // get the names of the chocolates from user
        // and store them into an array
        // print stored elements back to the user at the end
        // lindor, milka, milka, ferroro, snickers, m&m
        // if the name has 5 or less letters store it into 'shortNames' array
        // otherwise store it into 'longNames' array

        Scanner input=new Scanner(System.in);
        System.out.println("how many chocolate you want to store?");
        int size=input.nextInt();
        input.nextLine();
        String[] names=new String[size];
        String[] shortN=new String[size];
        String[] longN=new String[size];

        for (int i=0;i<size;i++){
            System.out.println("Pleas enter the name of chocolate"+(i+1));
            String str= input.nextLine();
            names[i]=str;
            if (str.length()>5){
                longN[i]=str;
            }else {
                shortN[i]=str;
            }
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(longN));
        System.out.println(Arrays.toString(shortN));








    }
}
