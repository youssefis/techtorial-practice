package mapPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ServiceConfigurationError;
import java.util.Set;

public class Practice4 {
    /*
    create a method that will take a map <String, String>
    this method will add message to ech key as follows:
    " ... is the best key"


     */
    public static void main(String[]args){

        HashMap <String,String> words=new HashMap<>();

        words.put("yusuf","13");words.put("joe","31");
        words.put("ahmed","12");words.put("leo","32");
        words.put("omar","23");words.put("ali","21");

        test1(words);



    }

    public static void test1(HashMap<String, String> map ){

        Set <String> set=map.keySet();
        for (String item:set){

            System.out.println(item+ " is the best key");
            // print out values

            System.out.println(map.get(item));

        }


    }

}
