package setPractice;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashSet set1= new HashSet();
        HashSet <String> set2 = new HashSet();
        HashSet <Integer> set3 = new HashSet<>();
        Set<String> set4 = new HashSet();
        System.out.println(set2);
        set2.add("Alex");
        set2.add("Adam");
        set2.add("sam");
        set2.add("Jenifer");
        //HashSet does not have order
        System.out.println(set2);
        set2.add("Alex");
        //null
        set2.add(null);
        System.out.println("added first null --> "+set2);
        set2.add(null);
        System.out.println("added second null --> "+set2);
        //show all elements one by one
        for (String item:set2){
            if (item!=null&&item.equalsIgnoreCase("Alex")){
                System.out.println("Hello "+item);
            }
        }
        System.out.println("-------------------");
        filter(set2);


//        System.out.println(set2);
////        String [] strs={"a","b","a"};
////        String [] strs2={"a","b","a"};
////        HashSet <String[]> set6= new HashSet<>();
////        set6.add(strs);
////        System.out.println(set6);
////        set6.add(strs2);
////        System.out.println(set6);


    }
    //create a method that will take set as a parameter
    //this method will filter String elements based on their length
    //length that are 5 or more should have starts next to it
    //others will have ? mark next to it
    public static void filter(HashSet <String> data){
        for (String word:data){
            if (word!=null&&word.length()>=5){
                System.out.println(word+" *");
            }else System.out.println(word+" ?");
        }
    }

}
