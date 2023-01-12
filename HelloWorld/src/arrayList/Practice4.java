package arrayList;

import java.util.ArrayList;

public class Practice4 {
    /*
    Create an arraylist to store 5 city name
    implement a logic to print only city names that have 6 or more letters
     */
    public static void main(String[] args) {


    ArrayList<String> cities=new ArrayList();
    cities.add("chicago");
    cities.add("marrakech");
    cities.add("fes");
    cities.add("zion");
    cities.add("dubai");
        System.out.println(cities); // [chicago, marrakech, fes, zion, dubai]

    for (String city:cities){
        if (city.length()>=6) {
            System.out.println(city);
        }
        }
        System.out.println("================");
    for (int i=0;i<cities.size();i++){
        if (cities.get(i).length()>=6){
            System.out.println(cities.get(i));
        }
    }


    }
}
