package arrays;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        String str1="Selenium";
        String[] parts =str1.split("n");
        System.out.println(Arrays.toString(parts));

        String str2="it is a good day to practice java. it is snowing outside.";
        str2=str2.replace(".","");
        //store every word in an array
        String[] words=str2.split(" ");
        System.out.println(Arrays.toString(words));
        String[] items= {"it", "is", "a", "good", "day", "to", "practice", "java", "it", "is", "snowing", "outside"};
        for (int i=0;i<items.length;i++){
            System.out.print(items[i]+" ");

        }
    }
}
