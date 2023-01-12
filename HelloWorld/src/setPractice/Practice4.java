package setPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();
        list.add("mac");
        list.add("mac");
        list.add("lenovo");
        list.add("mac");
        list.add("Acer");
        list.add("lenovo");

        // find out repeated elements from the given list
        // use set in to your solution logic
        // hint --> add();
        System.out.println(list);
        HashSet<String> set = new HashSet<>();
        ArrayList duplicates=new ArrayList();
        for (String item:list){
            if(!set.add(item)){
                duplicates.add(item);
                System.out.println("this is an repeated element -> "+item);

            }
        }
        System.out.println("duplicate list >>"+duplicates);




    }
}
