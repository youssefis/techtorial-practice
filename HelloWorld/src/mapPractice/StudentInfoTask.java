package mapPractice;

import java.util.*;

public class StudentInfoTask {

    /*
        FirstName: David
        LastName: Pena
        Age: 25
        Gender: M
        City: Chicago

        FirstName: Jeremiah
        LastName: Michaelson
        Age: 15
        Gender: M
        City: LakeForest

        FirstName: Michael
        LastName: White
        Age: 35
        Gender: M
        City: Winnetka

        FirstName: Sarah
        LastName: Star
        Age: 29
        Gender: F
        City: Chicago

        store students information in to maps
        store those student information into List
        From list of students, find out city of the student
        if student lives out of chicago, --> "You can join Online"
     */

    public static void main(String[] args) {

        HashMap<String,String> student1=new HashMap();
        student1.put("FirstName","David");
        student1.put("LastName","Pena");
        student1.put("Age","25");
        student1.put("Gender","M");
        student1.put("City","Chicago");

        HashMap<String,String> student2=new HashMap();
        student2.put("FirstName","Jeremiah");
        student2.put("LastName","Michaelson");
        student2.put("Age","15");
        student2.put("Gender","M");
        student2.put("City","LakeForest");

        HashMap<String,String> student3=new HashMap();
        student3.put("FirstName","Micheal");
        student3.put("LastName","White");
        student3.put("Age","35");
        student3.put("Gender","M");
        student3.put("City","Winnetka");

        HashMap<String,String> student4=new HashMap();
        student4.put("FirstName","Sarah");
        student4.put("LastName","star");
        student4.put("Age","29");
        student4.put("Gender","F");
        student4.put("City","Chicago");

        List<HashMap<String,String>> listOfStudent=new ArrayList();

        listOfStudent.add(student1);listOfStudent.add(student2);listOfStudent.add(student3);listOfStudent.add(student4);
        System.out.println("-->>>"+listOfStudent);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=================");
        // find student who are age of 30 or younger, and they live in chicago.
//        for (int i=0;i<listOfStudent.size();i++){
//            Integer.parseInt(listOfStudent.get(i).get("Age"));
//        }

        for (HashMap<String,String> item:listOfStudent){
            if (item.get("City").toString().equalsIgnoreCase("chicago")&& Integer.parseInt(item.get("Age"))<=30){
                System.out.println(item.get("FirstName")+" is from chicago and age of 30 or less");
            }

        }
        System.out.println("=================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        //listOfStudent.get(0).get("City")

        for (HashMap<String,String> student:listOfStudent){

            if(student.get("City")!="Chicago")
                System.out.println(student.get("City")+ " >> " + student.get ("FirstName") +" You can join Online");
            else
                System.out.println(student.get("City"));

        }



        System.out.println("=================================");
        for (int i=0; i<listOfStudent.size();i++)

            if (listOfStudent.get(i).get("City")!="Chicago")
                System.out.println(listOfStudent.get(i).get("City")+" >> " + listOfStudent.get(i).get("FirstName") + " You can join Online");
            else
                System.out.println(listOfStudent.get(i).get("City"));

        System.out.println("***************");
        System.out.println(listOfStudent);
        System.out.println("***************");
//        System.out.println("first names >> "+firstNames(listOfStudent));
//        System.out.println("last names >> "+lastNames(listOfStudent));

        System.out.println("=================result1=================");
        HashMap<String, List<String>> result1=fullNamesFinder(listOfStudent);
        System.out.println(result1);
        for ( String city :result1.get("Cities")){
            if (city.equalsIgnoreCase("Winnetka"))
                System.out.println("You are lucky since you live in "+city);
            else
                System.out.println(city);
        }
        System.out.println("=================result2=================");
        List <List<String>> result2= fullNamesFinder1(listOfStudent);
        System.out.println(result2);
        for(String city:result2.get(2)){
            if (city.equalsIgnoreCase("Winnetka"))
                System.out.println("You are lucky since you live in "+city);
            else
                System.out.println(city);
        }







    }




    // create a method has a parameter as list
    // and return all student firstnames in one list and lastNames in another list

    public static HashMap<String,List<String>> fullNamesFinder( List<HashMap<String,String>> list){

        List<String> firstNames=new ArrayList<>();
        List<String> lastNames=new ArrayList<>();
        // create another list for cities
        List<String> cities=new ArrayList<>();
        HashMap  <String,List<String>> fullName =new HashMap();
        for (HashMap<String,String>  student : list){


            firstNames.add(student.get("FirstName"));
            lastNames.add(student.get("LastName"));
            //find and add cities to the list you created
            cities.add(student.get("City"));



        }

        fullName.put("First Names",firstNames);
        fullName.put("Last Names",lastNames);
        // add your city list to the map
        fullName.put("Cities",cities);
        return fullName;
    }

    public static List<List <String>> fullNamesFinder1( List<HashMap<String,String>> list){

        List<String> firstNames=new ArrayList<>();
        List<String> lastNames=new ArrayList<>();
        // create another list for cities
        List<String> cities=new ArrayList<>();
        List<List <String>> fullName =new ArrayList<>();
        for ( HashMap<String,String> student : list){

            firstNames.add(student.get("FirstName"));
            lastNames.add(student.get("LastName"));
            //find and add cities to the list you created
            cities.add(student.get("City"));



        }

        fullName.add(firstNames);
        fullName.add(lastNames);
        fullName.add(cities);
        // add your city list to the map
        return fullName;
    }



}
