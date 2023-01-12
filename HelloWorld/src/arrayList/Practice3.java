package arrayList;

import object.Bottle;
import object.Cat;
import object.Flower;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<Integer> zipCodes= new ArrayList();
        zipCodes.add(540);
        zipCodes.add(600);
        zipCodes.add(404);
        zipCodes.add(202);
        System.out.println(zipCodes);
        for (int code:zipCodes){
            System.out.println(code+10);
        }
        System.out.println("+++++++++++++++");
        for (Object code:zipCodes){
            System.out.println(code);
        }
        System.out.println("================");
        ArrayList list1=new ArrayList();
        list1.add("Diana");
        list1.add(123);
        list1.add(true);
        System.out.println(list1.get(0).toString().toUpperCase());
        System.out.println(list1.get(1).toString().equals("123"));
        System.out.println("================");
        //contains
        System.out.println(zipCodes.contains(540));
        System.out.println(zipCodes.contains(100));
        boolean b=zipCodes.isEmpty();
        System.out.println(b);
        System.out.println("================");
        System.out.println(test2(zipCodes)    );
        ArrayList mixedTypes=new ArrayList();
        mixedTypes.add(8);
        mixedTypes.add("Test");
        mixedTypes.add(true);
        mixedTypes.add(5.6);
        mixedTypes.add('r');
        Cat cat=new Cat();
        mixedTypes.add(cat);
        Flower flower=new Flower();
        Bottle bottle=new Bottle(4);
        mixedTypes.add(flower);
        System.out.println(mixedTypes);
        mixedTypes.add(bottle);
        System.out.println(mixedTypes);


    }
    // create a method that will take an ArrayList as parameter
    // it will generate message for each item from the list
    // it will store and return those messages as an Arraylist

    public static ArrayList<String>test2(ArrayList<Integer> list){

        ArrayList<String> messages=new ArrayList<>();

        for (Integer number:list){
            messages.add("Hi"+number);

        }
        return messages;
    }












}
