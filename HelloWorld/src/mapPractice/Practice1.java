package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        HashMap<String,String> map= new HashMap<>();

        System.out.println(map);
        map.put("Alex","Smith");
        map.put("David","Brown");
        map.put("Mary","White");

        System.out.println(map);

        System.out.println(map.get("David"));
        String valueDavid= map.get("David");
        System.out.println(valueDavid);
        System.out.println(map.get(" David"));
        System.out.println(map.get(" sAm"));
        System.out.println(map.get(" Kevin"));
        System.out.println(map.get("Brown "));

    }

}
