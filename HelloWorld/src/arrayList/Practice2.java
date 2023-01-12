package arrayList;

import java.util.ArrayList;

public class Practice2 {

    //create an arrayList and store 6 car brands
    //print out brand of every car from the list one at a time
    // [a,b,c,d,e,f]

    // a@yahoo.com
    // b@yahoo.com
    public void elementsHasAFilter(ArrayList<String>allElements){
        for (int i=0;i<allElements.size();i++){
            if (allElements.get(i).contains("a")){
                System.out.println(allElements.get(i));
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> carsBrands=new ArrayList();
        carsBrands.add("a");
        carsBrands.add("b");
        carsBrands.add("c");
        carsBrands.add("d");
        carsBrands.add("ae");
        carsBrands.add("f");
        //System.out.println(carsBrands.size());
        for (int i=0;i<carsBrands.size();i++){

            System.out.println(carsBrands.get(i)+"@yahoo.com");

        }
        for (String car:carsBrands){
            System.out.println(car+"@gmail.com");
        }
        // create a method that will take an arraylist as parameter
        // parameter arraylist should hold String type elements
        // that method will show only elements which have letter 'a' in it
        Practice2 object=new Practice2();
        object.elementsHasAFilter(carsBrands);






    }

}
