package oop.finalPractice;

public class Shirt {

    final Double PRICE=11.99;
    String color;
    String size;

    public void sale(){
        System.out.println("sale");
    }



    final public void dye(){
        System.out.println("Changing color of SHIRT");

    }

    @Override
    protected void finalize()  {
        System.out.println("*****");
    }

}
