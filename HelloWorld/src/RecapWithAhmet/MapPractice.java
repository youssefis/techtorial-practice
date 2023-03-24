package RecapWithAhmet;

import java.util.*;

public class MapPractice {

    /*
    Possible interview Questions:

        1-can you tell me about map and why do you use it in your project?
        -> Map is an awesome interface to be used in my project to share/store my data
            as a key and value.
        2-What is the connection between Collection and Map?
        --> they are all useful that i use in my project for different purposes.
            As i mentioned before elements can not be duplicated on set.
            while List can have duplicated elements,
            while map have keys and values,
            Show off : did you know that there is a good connection that i realised
            when i was working on map, i checked the features of key and value.
            -->key acts like the set feature. it means it only accepts the unique data
            -->value acts like the list feature. it means it accepts duplicates as well

        3-What is the types of map and difference between them?
            -->HashMap-> it stores randomly
            -->LinkedMap-> it stores insertion
            -->TreeMap-> ascending order

        4-Synchronization? can you give examples and what do you know about it usage in java?
            In Java  -->   First come First Serv --->  In Automation --> Wait times
                      -->It executes any actions one by one(One after another)
           **-->We have two most common concepts in java use Synchronization
                -->HAshTable -->String Buffer
           ***--> Synchronized system is ***Thread Safe*******and ***********Slower**********
           ***-->   No synchronized system means --> Not Thread safe ---> Faster
                    -->List,Map,Set,String Builder.

     */

    public synchronized void run(){
        System.out.println("Hello");
    }
    public void run2(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {


        /*
             String[]fruits ={"Apple","Banana","Peach","Apple","Orange",
             "Strawberry","Banana","Apple","Cherry","Orange"};
            TASK:I want you get the output of total item for each:
            -->Apple=3,Banana=2,Orange=2,Strawberry=1,Cherry=1
            TIPS:You can use a method(map) containsKey
            TIPS:If condition

        */

        List<String> fruits = Arrays.asList ("Apple", "Banana", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Cherry", "Orange");
        Map<String,Integer> fruitsCount=new LinkedHashMap<>();

        for (String fruit:fruits){
            if (fruitsCount.containsKey(fruit)){
                fruitsCount.put(fruit,fruitsCount.get(fruit)+1);
            }else {
                fruitsCount.put(fruit,1);
            }
            }
        System.out.println(fruitsCount);

        System.out.println(fruitsCount.keySet());
        System.out.println(fruitsCount.entrySet());

        }


}
