package RecapWithAhmet;

import java.util.Arrays;

public class SplitMethod {
    /*
    String str="Hello Java is so good"

        output:olleH avaJ si  os doog
           avaJ
           si
           os
           doog
     */
    public static void main(String[] args) {
        String str="Hello Java is so good";
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse;
        for (String word:words){
            reverse="";
            for (int i=word.length()-1;i>=0;i--){

                reverse+=word.charAt(i);

            }
            System.out.print(reverse+" ");
        }







    }
}
