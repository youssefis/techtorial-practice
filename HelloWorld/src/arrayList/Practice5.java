package arrayList;

import object.Bottle;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {
    public static void main(String[] args) {
        /*
        Create an arrayList
        store some bottle objects
        manipulate elements from the arraylist
         */
        ArrayList <Bottle> list = new ArrayList<>();
        Bottle b1=new Bottle(6);
        Bottle b2=new Bottle(16);
        Bottle b3=new Bottle(26);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println(list);
        System.out.println(list.get(0).size);
        System.out.println(list.get(1).liquidAmount);
        // compare and find the difference between bottle1 and bottle2 size
        System.out.println(b2.size-b1.size);
        System.out.println(list.get(1).size-list.get(0).size);

        //check list and see
        //if any bottles size is more 10 print "this is a large bottle"
        System.out.println("********************");
        for (int i=0;i<list.size();i++){
            if (list.get(i).size>10){
                System.out.println("this is a large bottle "+list.get(i).size);
            }
        }
        System.out.println("---------------------");

        for (Bottle bottle:list){
            if (bottle.size>10){
                System.out.println(bottle.size+" this is a large bottle ");
            }
        }









    }

}
