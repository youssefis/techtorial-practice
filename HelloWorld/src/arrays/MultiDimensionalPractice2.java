package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice2 {
    public static void main(String[] args) {

        String[][] citiesFromStates= {{"Los Angelos","Sacramento"},{"Chicago","Springfield","Des Plains"},{"Baltimore","Rockville"}};

        // use for-each to show names of cities
        // print --> when you find chicago --> "chicago is in IL"
        for (String[] cities:citiesFromStates){

            for (String city:cities){

                if (city.equalsIgnoreCase("chicago")){
                    System.out.println(city+" is in IL");
                }else {
                    System.out.println(city);
                }

            }

        }

    }


}
