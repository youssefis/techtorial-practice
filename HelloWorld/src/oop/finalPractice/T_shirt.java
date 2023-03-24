package oop.finalPractice;

public class T_shirt extends Shirt{

    public void sle(){
        System.out.println("T_Shirt Sale");

    }

    // final method from parent can not be  overridden

//    public void dye(){
//        System.out.println();
//    }

    public static void main(String[] args) {

        Shirt shirt=new Shirt();
        shirt.dye();

        Shirt shirt1=new Shirt();
        Shirt shirt2=new Shirt();
        Shirt shirt3=new Shirt();

        shirt1=null;
        shirt2=null;

        System.gc();

    }



}
