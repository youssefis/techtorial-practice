package mapPractice;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Twenty", 20);
        map.put("Twenty-One", 21);
        map.put("Twenty-Two", 22);
        map.put("Twenty-Three", 23);
        map.put("Twenty-Four", 24);
        map.put("Twenty-Five", 25);
        map.put("Twenty-Six", 26);
        map.put("Twenty-Seven", 27);
        map.put("Twenty-Eight", 28);
        map.put("Twenty-Nine", 29);
        map.put("Thirty", 30);

        System.out.println(filteredNumbers(map));





    }
    /*
    create a method that will get a map as a parameter
    given map as parameters should be MAP<String, Integer>
    this method will find all values from the given map
    this method will return if the value is greater than 25
    this method return those greater numbers as a list
     */

    public static List<Integer> filteredNumbers(HashMap<String,Integer>map){
        ArrayList <Integer> list =new ArrayList<>();
        Collection <Integer> values= map.values();
        for (Integer value:values){

            if (value>25){


                list.add(value);

            }

        }
     return list;
    }


}
