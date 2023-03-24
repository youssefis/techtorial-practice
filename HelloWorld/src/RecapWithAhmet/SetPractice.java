package RecapWithAhmet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

    /*
    Possible interview Questions:
        1-How can you make the element unique with collection (American style)
        1-what is set? what is the purpose of using it? (Indian Style)

        --> In my project, I was using set to make the elements "Unique" to prevent
        duplication which causes some technical and business issue.
        -->It is a way to store the unique elements only

        2-what is the types of collections
            -List               -Set
            *ArrayList          *HashSet --> Randomly order
            *LinkedList         *LinkedList--> Insertion Order
                                *TreeSet --> Ascending order

        3-Explain the difference between Set and List
            ---> Set                                                --->List
            *Only Unique Elements (No duplication)                   *It can store Duplicates elements
            *It has different Sub-types(HashSet,LinkedSet,TreeSet)   *ArrayList, LinkedList
            *there is no indexing in set                             *It works mostly indexing(iteration)

     */

    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();
        Set<Integer> numbers2=new LinkedHashSet<>();
        Set<Integer> numbers3=new TreeSet<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(3);
        System.out.println(numbers);//random

        numbers2.add(1);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(3);
        System.out.println(numbers2);//insertion

        numbers3.add(1);
        numbers3.add(4);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        numbers3.add(2);
        System.out.println(numbers3);//ascending



    }




}
