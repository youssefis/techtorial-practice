package mapPractice;

import java.util.LinkedHashMap;

public class Practice51 {

     /*

    count numbers of each letter from the given String
    Example : String str= "Soccer is the best sport";
        S - 4
        o - 2
        c - 2
        e - 3
        r - 2
        i - 1
        t - 3
        h - 1
        b - 1
        p - 1

     */

    public static void main(String[] args) {

        String str= "Soccer is the best sport".toLowerCase().trim().replace(" ","");
        LinkedHashMap <Character,Integer> map =new LinkedHashMap<>();

        for (int i=0;i<str.length();i++){

            if (map.containsKey(str.charAt(i))){

                map.put(str.charAt(i),map.get(str.charAt(i))+1);

            }else map.put(str.charAt(i),1);

        }
        System.out.println(map);


    }


}
