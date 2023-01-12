package arrays;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        String drinks[]={"tea","water","coffee","coke","orange","apple","lemonade",};
        System.out.println(Arrays.toString(drinks));
        Arrays.sort(drinks);

        System.out.println("==================After Sort==============");

        System.out.println(Arrays.toString(drinks));
        System.out.println("The position of tea is "+Arrays.binarySearch(drinks,"tea"));
        System.out.println("The position of apple is "+Arrays.binarySearch(drinks,"apple"));
        System.out.println("The position of water is "+Arrays.binarySearch(drinks,"water"));
        System.out.println(Arrays.binarySearch(drinks,2,5,"orange"));
    }
}
