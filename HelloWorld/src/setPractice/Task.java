package setPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task {

    // create a method that will take String array as parameter,
    // and will return values as a set collection
    // String[] array= {"phone","clock","timer","cup","microphone"}

    public static void main(String[] args) {
        String[] array= {"phone","clock","timer","cup","microphone","microphone","clock"};
        Set<String> set1=collection(array);
        System.out.println(set1);

    }

    public static HashSet<String> collection(String array[]){
        HashSet <String> set=new HashSet();
        for (String item: array){

            set.add(item);

        }

    return set;
    }


}
