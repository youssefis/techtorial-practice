package object;

import java.util.Arrays;

public class MethodPractice3Test {

  public static void main(String[] args) {
    String[] arrayOfVeggies={"Green beans","Onion","Red tomatoes", "Mushroom","Cucumber", "Green Pepper"};
    MethodPractice3.veggieFilter(arrayOfVeggies);
    String[] array=MethodPractice3.veggieFilter(arrayOfVeggies,2);
    System.out.println(Arrays.toString(array));


  }



}

