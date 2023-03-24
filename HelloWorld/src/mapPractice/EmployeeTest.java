package mapPractice;

import java.util.HashMap;

public class EmployeeTest {

    public static void main(String[] args) {



    Employee employee1=new Employee("ahmad","marrakech",36);
    Employee employee2=new Employee("omar","chicago",20);
    Employee employee3=new Employee("youssef","Dubai",28);
    Employee employee4=new Employee("meriam","Dubai",25);
    HashMap<Integer,Employee> map=new HashMap<>();

    map.put(employee1.idGenerated(), employee1);
    map.put(employee2.idGenerated(), employee2);
    map.put(employee3.idGenerated(),employee3);
    map.put(employee4.idGenerated(), employee4);


    System.out.println(map);

    namePrinter(map);




    }

    public static void namePrinter(HashMap<Integer,Employee>map){

        for (Employee employee:map.values()){

            System.out.println(employee.name);


        }

    }
















//    public static void main(String[] args) {
//
//        Employee e1 =new Employee("Emma","Chicago",30);
//        Employee e2 =new Employee("Alex","Des Plains",30);
//        Employee e3 =new Employee("Sam","Chicago",30);
//        Employee e4 =new Employee("David","Zion",30);
//
//        HashMap <Integer,Employee> employeeMap=new HashMap<>();
//
//        employeeMap.put(e1.id,e1);
//        employeeMap.put(e2.id,e2);
//        employeeMap.put(e3.id,e3);
//        employeeMap.put(e4.id,e4);
//
//        System.out.println(employeeMap);
//        nameFinder(employeeMap);
//
//    }
//
//    public static void nameFinder(HashMap<Integer,Employee>map){
//
//        for (Employee employee:map.values()){
//
//            System.out.println(employee.name);
//
//        }
//
//    }

}
