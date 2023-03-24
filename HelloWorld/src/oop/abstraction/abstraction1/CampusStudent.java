package oop.abstraction.abstraction1;

public class CampusStudent extends Student{

    public CampusStudent(String name,int id){

        super(name,id);

    }

    public void study(){

        System.out.println("Studying in campus");

    }

    // no abstract class can not have abstract method
    // public abstract void drink();

    public void sleep(){
        System.out.println("Campus student is sleeping for 5 Hours");
    }

    public  int test1(){
        System.out.println("Campus Student taking test");
        return 3;
    }
    public void playTableTennis(){

        System.out.println("Table Tennis");

    }


}
