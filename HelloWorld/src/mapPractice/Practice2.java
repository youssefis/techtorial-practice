package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args){

        HashMap<Integer, String> map = new HashMap();

        map.put(10,"Alex");
        map.put(20,"Sam");
        map.put(30,"Tom");

        System.out.println(map);
        System.out.println(map.get(30)); //Tom

        map.put(20,"Vitaly"); // if the key is existing on the map,
        // the value will be resigned                   2d

        System.out.println(map);

        map.put(40,"Natalie");
        map.put(50,"Natalie");
        map.put(60,"Natalie");
        map.put(70,"Natalie");
        System.out.println(map);

        // how to reach out values individually?
        // {50=Natalie, 20=Vitaly, 70=Natalie, 40=Natalie, 10=Alex, 60=Natalie, 30=Tom}

        System.out.println(map.get(10)); //Alex
        System.out.println(map.get(20)); //Vitaly
        System.out.println(map.get(30)); // Tom
        ///...
        //how can i have all keys on hand?
        //keySet() --> it will return all keys from the map
        System.out.println(map.keySet());
        Set<Integer> keys=map.keySet(); //[50, 20, 70, 40, 10, 60, 30]
        System.out.println(keys);

        for (Integer key:keys){
            System.out.println(key+"  "+map.get(key));
        }
        System.out.println("+++++++");

        // reach out values;
        // values();

        Collection<String> values= map.values();
        System.out.println(values);

        for (String value:values){
            System.out.println("*"+value+"*");
        }

        //replace();
        map.replace(40,"XXXX");
        System.out.println(map);

        map.replace(90,"YYYYYYY");
        System.out.println(map);

        map.replace(70,"Natalie","Jenny");
        System.out.println(map);

        // map has size --> size()

        int a=map.size();
        System.out.println(a);
        System.out.println("====================");
        System.out.println(map.containsKey("10"));
        System.out.println(map.containsKey(Integer.parseInt("10")));
        System.out.println("====================");
        // containsKey
        System.out.println(map.containsKey(40));
        System.out.println(map.containsValue("Jenny"));

        //isEmpty()
        System.out.println(map.isEmpty());

        //clear
        // System.out.println(map.clear()); cannot print void method
        map.clear();
        System.out.println(map.isEmpty());












    }

}
