package loops;

import java.util.Arrays;

public class ForEachPractice2 {
    public static void main(String[] args) {

        String[] flowers={"rose","daisy","sunflower"};
        for (String flower : flowers){

            System.out.println(flower.toUpperCase());
        }
        System.out.println("===========");
        String[] cities={"Chicago","Miami","New York","Tokyo","Doha","Denver"};

        // make email form of each city ex: chicago@gmail.com
        // store those emails into a reference storage for future use
        String cityemail[]= new String[cities.length];
        int i=0;
        for (String city:cities){

            cityemail[i]=city.toLowerCase().replace(" ","").concat("@gmail.com");
            i++;
        }
        System.out.println(Arrays.toString(cityemail));

    }
}
