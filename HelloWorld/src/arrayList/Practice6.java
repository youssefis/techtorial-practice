package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Practice6 {
    public static void main(String[] args) {
        List list1=new ArrayList();
        list1.add("IL");
        list1.add("OH");
        System.out.println(list1.get(0));
        //convert from array to arrayList
        int[] digits ={3,4,5,6};
        List<int[] > a=Arrays.asList(digits);
        // a.add(12); UnsupportedOperationException
        System.out.println(a);
        System.out.println(Arrays.toString( a.get(0) ));
        System.out.println(a.get(0)[0]);

        //convert from arrayList to array
        ArrayList items=new ArrayList();
        items.add("Alex");
        items.add("Ana");
        System.out.println(items);
        Object[]array=items.toArray();
        System.out.println( Arrays.toString(array));
        array[1]="Luna";
        System.out.println(Arrays.toString(array));


    }
}
