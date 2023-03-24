package RecapWithAhmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

    /*
    Possible Interview Questions:
        1-What is the difference between List And Array?
            -->answer is on ArrayPractice class
        2-What is the difference between ArrayList and LinkedList?
            -->List -> is a part of Collection it can be used for
            storing (Objects)
            -->ArrayList --> it is a way to store Objects and access
            these objects with a specific methods. (.get)

            -->LinkedList --> It is a way to store Objects and access these
            objects with a specific methods.(.get)
            --> to be honest i do not use LinkedList in my project but
            as much as i know there is execution time difference for accessing
            the data from the List SHOW off:
            **>> The reaching out elements inside the list is more efficient
            and faster in arrayList.
            ArrayList<Object> --> arrayList.get(0)   --> 0.02 (time)
            LinkedLIst<Object> --> linkedList.get(0) --> 0.04 (time)

         ***-> When you do any manipulation(changing, replacing, inserting, removing)
        at this case LinkedLIst will be faster
     */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        ArrayList list2= new ArrayList();
        LinkedList list3=new LinkedList<>();
        List list4=new LinkedList<>();
        list2.add("Hello"); //
        System.out.println(list2.get(0));
        List<String> names= Arrays.asList("Ahmet", "Mehmet","Mahmut");
        for (String name:names){
            System.out.println(name);
        }

    }




}
